// Generated from E:/Downloads/Brainfuck/src/Brainfuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainfuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainfuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BrainfuckParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(BrainfuckParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveLeft}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveLeft(BrainfuckParser.MoveLeftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveRight}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveRight(BrainfuckParser.MoveRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(BrainfuckParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(BrainfuckParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code output}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(BrainfuckParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BrainfuckParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(BrainfuckParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nil}
	 * labeled alternative in {@link BrainfuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(BrainfuckParser.NilContext ctx);
}