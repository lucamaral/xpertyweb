package grammar;
// Generated from Xperty.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XpertyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XpertyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XpertyParser#rule_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_start(@NotNull XpertyParser.Rule_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#more_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_condition(@NotNull XpertyParser.More_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#rule_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_result(@NotNull XpertyParser.Rule_resultContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#positive_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_integer(@NotNull XpertyParser.Positive_integerContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(@NotNull XpertyParser.IntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#decimal_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_separator(@NotNull XpertyParser.Decimal_separatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(@NotNull XpertyParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull XpertyParser.NumberContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(@NotNull XpertyParser.DecimalContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#link_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_condition(@NotNull XpertyParser.Link_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#positive_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_decimal(@NotNull XpertyParser.Positive_decimalContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#negative_decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_decimal(@NotNull XpertyParser.Negative_decimalContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#rule_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_condition(@NotNull XpertyParser.Rule_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull XpertyParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#negative_integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_integer(@NotNull XpertyParser.Negative_integerContext ctx);

	/**
	 * Visit a parse tree produced by {@link XpertyParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(@NotNull XpertyParser.ConditionalContext ctx);
}