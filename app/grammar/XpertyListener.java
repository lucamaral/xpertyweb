package grammar;
// Generated from Xperty.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XpertyParser}.
 */
public interface XpertyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XpertyParser#rule_start}.
	 * @param ctx the parse tree
	 */
	void enterRule_start(@NotNull XpertyParser.Rule_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#rule_start}.
	 * @param ctx the parse tree
	 */
	void exitRule_start(@NotNull XpertyParser.Rule_startContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#more_condition}.
	 * @param ctx the parse tree
	 */
	void enterMore_condition(@NotNull XpertyParser.More_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#more_condition}.
	 * @param ctx the parse tree
	 */
	void exitMore_condition(@NotNull XpertyParser.More_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#rule_result}.
	 * @param ctx the parse tree
	 */
	void enterRule_result(@NotNull XpertyParser.Rule_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#rule_result}.
	 * @param ctx the parse tree
	 */
	void exitRule_result(@NotNull XpertyParser.Rule_resultContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#positive_integer}.
	 * @param ctx the parse tree
	 */
	void enterPositive_integer(@NotNull XpertyParser.Positive_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#positive_integer}.
	 * @param ctx the parse tree
	 */
	void exitPositive_integer(@NotNull XpertyParser.Positive_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull XpertyParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull XpertyParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#decimal_separator}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_separator(@NotNull XpertyParser.Decimal_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#decimal_separator}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_separator(@NotNull XpertyParser.Decimal_separatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull XpertyParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull XpertyParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull XpertyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull XpertyParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull XpertyParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull XpertyParser.DecimalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#link_condition}.
	 * @param ctx the parse tree
	 */
	void enterLink_condition(@NotNull XpertyParser.Link_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#link_condition}.
	 * @param ctx the parse tree
	 */
	void exitLink_condition(@NotNull XpertyParser.Link_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#positive_decimal}.
	 * @param ctx the parse tree
	 */
	void enterPositive_decimal(@NotNull XpertyParser.Positive_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#positive_decimal}.
	 * @param ctx the parse tree
	 */
	void exitPositive_decimal(@NotNull XpertyParser.Positive_decimalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#negative_decimal}.
	 * @param ctx the parse tree
	 */
	void enterNegative_decimal(@NotNull XpertyParser.Negative_decimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#negative_decimal}.
	 * @param ctx the parse tree
	 */
	void exitNegative_decimal(@NotNull XpertyParser.Negative_decimalContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#rule_condition}.
	 * @param ctx the parse tree
	 */
	void enterRule_condition(@NotNull XpertyParser.Rule_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#rule_condition}.
	 * @param ctx the parse tree
	 */
	void exitRule_condition(@NotNull XpertyParser.Rule_conditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull XpertyParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull XpertyParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#negative_integer}.
	 * @param ctx the parse tree
	 */
	void enterNegative_integer(@NotNull XpertyParser.Negative_integerContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#negative_integer}.
	 * @param ctx the parse tree
	 */
	void exitNegative_integer(@NotNull XpertyParser.Negative_integerContext ctx);

	/**
	 * Enter a parse tree produced by {@link XpertyParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull XpertyParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XpertyParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull XpertyParser.ConditionalContext ctx);
}