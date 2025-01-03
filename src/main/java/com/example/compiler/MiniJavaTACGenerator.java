package com.example.compiler;

import gen.com.example.compiler.MiniJavaGrammarBaseVisitor;
import gen.com.example.compiler.MiniJavaGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class MiniJavaTACGenerator extends MiniJavaGrammarBaseVisitor<String> {
    private int tempCounter = 0; // For temporary variables
    private List<String> tacInstructions = new ArrayList<>();
    private int labelCounter = 0; // For unique labels in control flow

    // Generate a unique temporary variable name
    private String newTemp() {
        return "t" + (tempCounter++);
    }

    // Generate a unique label for control flow (e.g., "L1", "L2")
    private String newLabel() {
        return "L" + (labelCounter++);
    }

    // Emit a TAC instruction
    private void emit(String instruction) {
        tacInstructions.add(instruction);
    }

    // Return the list of TAC instructions generated
    public List<String> getTAC() {
        return tacInstructions;
    }

    @Override
    public String visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 3) { // Binary operation (e.g., a + b)
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
            // Variable assignment (a = b;)
            String varName = ctx.IDENTIFIER().getText();
            String value = visit(ctx.expression(0));
            emit(varName + " = " + value + ";");
        } else if (ctx.getChild(0).getText().equals("System.out.println")) {
            // Print statement (e.g., System.out.println(52);)
            String value = visit(ctx.expression(0));
            emit("print " + value + ";");
        } else if (ctx.getChild(0).getText().equals("if")) {
            // Handle if statement (if (condition) { ... } else { ... })
            String condition = visit(ctx.expression(0));
            String elseLabel = newLabel();
            String endLabel = newLabel();

            // Emit the condition check
            emit("if !" + condition + " goto " + elseLabel + ";");

            // Visit the 'then' part
            visit(ctx.statement().get(0));
            emit("goto " + endLabel + ";");

            // Else block (if it exists)
            emit(elseLabel + ":");
            if (ctx.statement(1) != null) {
                visit(ctx.statement(1));
            } else {
                emit("NOP;"); // Ensure the label isn't empty
            }

            // End label
            emit(endLabel + ":");
        } else if (ctx.getChild(0).getText().equals("while")) {
            // Handle while statement (e.g., while (condition) { ... })
            String loopStartLabel = newLabel();
            String loopEndLabel = newLabel();

            // Emit the loop start label
            emit(loopStartLabel + ":");

            // Emit the condition check
            String condition = visit(ctx.expression(0));
            emit("if !" + condition + " goto " + loopEndLabel + ";");

            // Visit the loop body
            visit(ctx.statement().get(0));

            // Jump back to the start of the loop
            emit("goto " + loopStartLabel + ";");

            // Emit the loop end label
            emit(loopEndLabel + ":");
        } else if (ctx.getChild(0).getText().equals("return")) {
            // Handle return statement (e.g., return a + b;)
            if (ctx.expression() != null) {
                String returnValue = visit(ctx.expression(0));
                emit("return " + returnValue + ";");
            } else {
                emit("return;");
            }
        }else if (ctx.getChild(0).getText().equals("{")) {
            if (ctx.statement() != null) {
                visit(ctx.statement(0));
            }
        }

        return null;
    }

    // This method will print out the TAC instructions for debugging or further processing
    public void writeTAC() {
        for (String instruction : tacInstructions) {
            System.out.println(instruction);
        }
    }
}
