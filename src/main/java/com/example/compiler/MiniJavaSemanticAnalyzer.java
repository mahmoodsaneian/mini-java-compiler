package com.example.compiler;

import gen.com.example.compiler.MiniJavaGrammarBaseVisitor;
import gen.com.example.compiler.MiniJavaGrammarParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class MiniJavaSemanticAnalyzer extends MiniJavaGrammarBaseVisitor<Void> {
    private static class Symbol {
        String name;
        String type;
        boolean isMethod;
        int paramCount;

        Symbol(String name, String type, boolean isMethod, int paramCount) {
            this.name = name;
            this.type = type;
            this.isMethod = isMethod;
            this.paramCount = paramCount;
        }
    }

    private static class Scope {
        Map<String, Symbol> symbols = new HashMap<>();
    }

    private final Stack<Scope> scopes = new Stack<>();

    public MiniJavaSemanticAnalyzer() {
        scopes.push(new Scope()); // Global scope
    }

    private void enterScope() {
        scopes.push(new Scope());
    }

    private void exitScope() {
        scopes.pop();
    }

    private void declareSymbol(String name, String type, boolean isMethod, int paramCount) {
        Scope currentScope = scopes.peek();
        if (currentScope.symbols.containsKey(name)) {
            System.err.println("Error: Symbol '" + name + "' is already declared in this scope.");
        } else {
            currentScope.symbols.put(name, new Symbol(name, type, isMethod, paramCount));
        }
    }

    private Symbol lookupSymbol(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Scope scope = scopes.get(i);
            if (scope.symbols.containsKey(name)) {
                return scope.symbols.get(name);
            }
        }
        return null;
    }

    @Override
    public Void visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitMainClass(MiniJavaGrammarParser.MainClassContext ctx) {
        enterScope(); // Main class scope
        super.visitMainClass(ctx);
        exitScope();
        return null;
    }

    @Override
    public Void visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx) {
        String className = ctx.IDENTIFIER(0).getText();
        declareSymbol(className, "class", false, 0);

        enterScope(); // Class scope
        super.visitClassDeclaration(ctx);
        exitScope();
        return null;
    }

    @Override
    public Void visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String varType = ctx.type().getText();
        declareSymbol(varName, varType, false, 0);
        return null;
    }

    @Override
    public Void visitConstructorDeclaration(MiniJavaGrammarParser.ConstructorDeclarationContext ctx){
        String methodName = ctx.IDENTIFIER().getText();
        int paramCount = ctx.parameter() != null ? ctx.parameter().size() : 0;

        declareSymbol(methodName,null, true, paramCount);

        enterScope();

        if (ctx.parameter() != null) {
            for (MiniJavaGrammarParser.ParameterContext param : ctx.parameter()) {
                String paramName = param.IDENTIFIER().getText();
                String paramType = param.type().getText();
                declareSymbol(paramName, paramType, false, 0);
            }
        }

        super.visitConstructorDeclaration(ctx);
        exitScope();
        return null;
    }

    @Override
    public Void visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        String returnType = ctx.type() != null ? ctx.type().getText() : "void"; // Handle void return type
        int paramCount = ctx.parameter() != null ? ctx.parameter().size() : 0;

        // Declare the method in the current scope
        declareSymbol(methodName, returnType, true, paramCount);

        enterScope(); // Method scope

        // Declare parameters in the method scope
        if (ctx.parameter() != null) {
            for (MiniJavaGrammarParser.ParameterContext param : ctx.parameter()) {
                String paramName = param.IDENTIFIER().getText();
                String paramType = param.type().getText();
                declareSymbol(paramName, paramType, false, 0);
            }
        }

        // Check return statements
        if (returnType.equals("void")) {
            // Ensure no return expressions are used in void methods
            if (ctx.expression() != null) {
                System.err.println("Error: Void method '" + methodName + "' should not return a value.");
            }
        } else {
            // Ensure a return expression is provided for non-void methods
            if (ctx.expression() == null) {
                System.err.println("Error: Method '" + methodName + "' must return a value of type '" + returnType + "'.");
            }
        }

        super.visitMethodDeclaration(ctx);
        exitScope();
        return null;
    }


    @Override
    public Void visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String name = ctx.IDENTIFIER().getText();
            Symbol symbol = lookupSymbol(name);

            if (ctx.getChild(1).getText().equals("=")) {
                // Variable assignment
                if (symbol == null || symbol.isMethod) {
                    System.err.println("Error: Variable '" + name + "' is not declared.");
                }
            } else if (ctx.getChild(1).getText().equals("(")) {
                // Method call
                if (symbol == null || !symbol.isMethod) {
                    System.err.println("Error: Method '" + name + "' is not declared.");
                } else {
                    // Check arguments
                    List<MiniJavaGrammarParser.ExpressionContext> args = ctx.expression();
                    if (args.size() != symbol.paramCount) {
                        System.err.println("Error: Method '" + name + "' expects " + symbol.paramCount +
                                " arguments, but got " + args.size() + ".");
                    }
                }
            }
        }
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String name = ctx.IDENTIFIER().getText();
            Symbol symbol = lookupSymbol(name);

            if (symbol == null) {
                System.err.println("Error: Variable or method '" + name + "' is not declared.");
            }
        }
        return super.visitExpression(ctx);
    }
}
