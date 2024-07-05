// Generated from E:/Downloads/ArnoldC/src/ArnoldC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArnoldCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArnoldCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(ArnoldCParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#funCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(ArnoldCParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArnoldCParser#funDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclare(ArnoldCParser.FunDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modify}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify(ArnoldCParser.ModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declare}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(ArnoldCParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunction}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(ArnoldCParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ArnoldCParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(ArnoldCParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ArnoldCParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ArnoldCParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignByCall}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignByCall(ArnoldCParser.AssignByCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatCom}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatCom(ArnoldCParser.ConcatComContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printVal}
	 * labeled alternative in {@link ArnoldCParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVal(ArnoldCParser.PrintValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmetic}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(ArnoldCParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical}
	 * labeled alternative in {@link ArnoldCParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(ArnoldCParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ArnoldCParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ArnoldCParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ArnoldCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ArnoldCParser.IdContext ctx);
}