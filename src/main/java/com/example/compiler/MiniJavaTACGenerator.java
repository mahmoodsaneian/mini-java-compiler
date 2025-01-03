package com.example.compiler;

import gen.com.example.compiler.MiniJavaGrammarBaseVisitor;
import gen.com.example.compiler.MiniJavaGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class MiniJavaTACGenerator extends MiniJavaGrammarBaseVisitor<String> {
    private int tempCounter = 0; // For temporary variables
    private List<String> tacInstructions = new ArrayList<>();

    private String newTemp() {
        return "t" + (tempCounter++);
    }

    private void emit(String instruction) {
        tacInstructions.add(instruction);
    }

    public List<String> getTAC() {
        return tacInstructions;
    }

    @Override
    public String visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) { // Binary operation
            String left = visit(ctx.expression(0));
            String right = visit(ctx.expression(1));
            String temp = newTemp();
            emit(temp + " = " + left + " " + ctx.getChild(1).getText() + " " + right + ";");
            return temp;
        } else if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        } else if (ctx.INTEGER_LITERAL() != null) {
            return ctx.INTEGER_LITERAL().getText();
        }
        return super.visitExpression(ctx);
    }

    @Override
    public String visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if (ctx.IDENTIFIER() != null && ctx.getChild(1).getText().equals("=")) {
            String varName = ctx.IDENTIFIER().getText();
            String value = visit(ctx.expression(0));
            emit(varName + " = " + value + ";");
        } else if (ctx.getChild(0).getText().equals("System.out.println")) {
            String value = visit(ctx.expression(0));
            emit("print " + value + ";");
        }
        return null;
    }

    public void writeTAC() {
        for (String instruction : tacInstructions) {
            System.out.println(instruction);
        }
    }
}
