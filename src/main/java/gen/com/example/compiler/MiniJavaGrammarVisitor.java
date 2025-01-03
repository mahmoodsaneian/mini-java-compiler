// Generated from D:/University Things/Semester 7/Compiler design/final-project/compiler/src/main/java/com/example/compiler/MiniJavaGrammar.g4 by ANTLR 4.13.2
package gen.com.example.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(MiniJavaGrammarParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(MiniJavaGrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
}