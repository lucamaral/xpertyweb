package grammar;
// Generated from Xperty.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XpertyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, FI=3, STRING=4, INT=5, BOOLEAN=6, MINUS=7, COMMA=8, DOT=9, 
		AND=10, OR=11, NOT_EQUAL=12, GREATER=13, GREATER_OR_EQUAL=14, LOWER=15, 
		LOWER_OR_EQUAL=16, EQUALS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "IF", "THEN", "FI", "STRING", "INT", "BOOLEAN", "'-'", "','", 
		"'.'", "AND", "OR", "'<>'", "'>'", "'>='", "'<'", "'<='", "'='"
	};
	public static final int
		RULE_rule_start = 0, RULE_rule_condition = 1, RULE_more_condition = 2, 
		RULE_link_condition = 3, RULE_rule_result = 4, RULE_attribute = 5, RULE_conditional = 6, 
		RULE_value = 7, RULE_number = 8, RULE_positive_integer = 9, RULE_negative_integer = 10, 
		RULE_integer = 11, RULE_positive_decimal = 12, RULE_negative_decimal = 13, 
		RULE_decimal = 14, RULE_decimal_separator = 15;
	public static final String[] ruleNames = {
		"rule_start", "rule_condition", "more_condition", "link_condition", "rule_result", 
		"attribute", "conditional", "value", "number", "positive_integer", "negative_integer", 
		"integer", "positive_decimal", "negative_decimal", "decimal", "decimal_separator"
	};

	@Override
	public String getGrammarFileName() { return "Xperty.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public XpertyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Rule_startContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(XpertyParser.THEN, 0); }
		public TerminalNode IF() { return getToken(XpertyParser.IF, 0); }
		public TerminalNode FI() { return getToken(XpertyParser.FI, 0); }
		public Rule_resultContext rule_result() {
			return getRuleContext(Rule_resultContext.class,0);
		}
		public Rule_conditionContext rule_condition() {
			return getRuleContext(Rule_conditionContext.class,0);
		}
		public Rule_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterRule_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitRule_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitRule_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_startContext rule_start() throws RecognitionException {
		Rule_startContext _localctx = new Rule_startContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rule_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(IF);
			setState(33); rule_condition();
			setState(34); match(THEN);
			setState(35); rule_result();
			setState(36); match(FI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_conditionContext extends ParserRuleContext {
		public More_conditionContext more_condition() {
			return getRuleContext(More_conditionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Rule_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterRule_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitRule_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitRule_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_conditionContext rule_condition() throws RecognitionException {
		Rule_conditionContext _localctx = new Rule_conditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); attribute();
			setState(39); conditional();
			setState(40); value();
			setState(42);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(41); more_condition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class More_conditionContext extends ParserRuleContext {
		public Rule_conditionContext rule_condition() {
			return getRuleContext(Rule_conditionContext.class,0);
		}
		public Link_conditionContext link_condition() {
			return getRuleContext(Link_conditionContext.class,0);
		}
		public More_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterMore_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitMore_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitMore_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_conditionContext more_condition() throws RecognitionException {
		More_conditionContext _localctx = new More_conditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_more_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); link_condition();
			setState(45); rule_condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_conditionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(XpertyParser.AND, 0); }
		public TerminalNode OR() { return getToken(XpertyParser.OR, 0); }
		public Link_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterLink_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitLink_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitLink_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_conditionContext link_condition() throws RecognitionException {
		Link_conditionContext _localctx = new Link_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_link_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rule_resultContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(XpertyParser.EQUALS, 0); }
		public Rule_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterRule_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitRule_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitRule_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_resultContext rule_result() throws RecognitionException {
		Rule_resultContext _localctx = new Rule_resultContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); attribute();
			setState(50); match(EQUALS);
			setState(51); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(XpertyParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public TerminalNode GREATER_OR_EQUAL() { return getToken(XpertyParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode EQUALS() { return getToken(XpertyParser.EQUALS, 0); }
		public TerminalNode LOWER() { return getToken(XpertyParser.LOWER, 0); }
		public TerminalNode GREATER() { return getToken(XpertyParser.GREATER, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(XpertyParser.NOT_EQUAL, 0); }
		public TerminalNode LOWER_OR_EQUAL() { return getToken(XpertyParser.LOWER_OR_EQUAL, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_EQUAL) | (1L << GREATER) | (1L << GREATER_OR_EQUAL) | (1L << LOWER) | (1L << LOWER_OR_EQUAL) | (1L << EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(XpertyParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(XpertyParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(STRING);
				}
				break;
			case INT:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); number();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); integer();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); decimal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Positive_integerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(XpertyParser.INT, 0); }
		public Positive_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterPositive_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitPositive_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitPositive_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Positive_integerContext positive_integer() throws RecognitionException {
		Positive_integerContext _localctx = new Positive_integerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_positive_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_integerContext extends ParserRuleContext {
		public Positive_integerContext positive_integer() {
			return getRuleContext(Positive_integerContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XpertyParser.MINUS, 0); }
		public Negative_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterNegative_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitNegative_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitNegative_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_integerContext negative_integer() throws RecognitionException {
		Negative_integerContext _localctx = new Negative_integerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_negative_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(MINUS);
			setState(69); positive_integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public Positive_integerContext positive_integer() {
			return getRuleContext(Positive_integerContext.class,0);
		}
		public Negative_integerContext negative_integer() {
			return getRuleContext(Negative_integerContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integer);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); positive_integer();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); negative_integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Positive_decimalContext extends ParserRuleContext {
		public Decimal_separatorContext decimal_separator() {
			return getRuleContext(Decimal_separatorContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(XpertyParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(XpertyParser.INT, i);
		}
		public Positive_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterPositive_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitPositive_decimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitPositive_decimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Positive_decimalContext positive_decimal() throws RecognitionException {
		Positive_decimalContext _localctx = new Positive_decimalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_positive_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(INT);
			setState(76); decimal_separator();
			setState(77); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_decimalContext extends ParserRuleContext {
		public Positive_decimalContext positive_decimal() {
			return getRuleContext(Positive_decimalContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(XpertyParser.MINUS, 0); }
		public Negative_decimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterNegative_decimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitNegative_decimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitNegative_decimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_decimalContext negative_decimal() throws RecognitionException {
		Negative_decimalContext _localctx = new Negative_decimalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_negative_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(MINUS);
			setState(80); positive_decimal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public Positive_decimalContext positive_decimal() {
			return getRuleContext(Positive_decimalContext.class,0);
		}
		public Negative_decimalContext negative_decimal() {
			return getRuleContext(Negative_decimalContext.class,0);
		}
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decimal);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); positive_decimal();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); negative_decimal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_separatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(XpertyParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(XpertyParser.COMMA, 0); }
		public Decimal_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).enterDecimal_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XpertyListener ) ((XpertyListener)listener).exitDecimal_separator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XpertyVisitor ) return ((XpertyVisitor<? extends T>)visitor).visitDecimal_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_separatorContext decimal_separator() throws RecognitionException {
		Decimal_separatorContext _localctx = new Decimal_separatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decimal_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==DOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\23[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\t?\n\t\3\n\3\n\5\nC\n\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\5\rL\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\5"+
		"\20W\n\20\3\21\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\2\5\3\2\f\r\3\2\16\23\3\2\n\13P\2\"\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\61"+
		"\3\2\2\2\n\63\3\2\2\2\f\67\3\2\2\2\169\3\2\2\2\20>\3\2\2\2\22B\3\2\2\2"+
		"\24D\3\2\2\2\26F\3\2\2\2\30K\3\2\2\2\32M\3\2\2\2\34Q\3\2\2\2\36V\3\2\2"+
		"\2 X\3\2\2\2\"#\7\3\2\2#$\5\4\3\2$%\7\4\2\2%&\5\n\6\2&\'\7\5\2\2\'\3\3"+
		"\2\2\2()\5\f\7\2)*\5\16\b\2*,\5\20\t\2+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-"+
		"\5\3\2\2\2./\5\b\5\2/\60\5\4\3\2\60\7\3\2\2\2\61\62\t\2\2\2\62\t\3\2\2"+
		"\2\63\64\5\f\7\2\64\65\7\23\2\2\65\66\5\20\t\2\66\13\3\2\2\2\678\7\6\2"+
		"\28\r\3\2\2\29:\t\3\2\2:\17\3\2\2\2;?\7\6\2\2<?\5\22\n\2=?\7\b\2\2>;\3"+
		"\2\2\2><\3\2\2\2>=\3\2\2\2?\21\3\2\2\2@C\5\30\r\2AC\5\36\20\2B@\3\2\2"+
		"\2BA\3\2\2\2C\23\3\2\2\2DE\7\7\2\2E\25\3\2\2\2FG\7\t\2\2GH\5\24\13\2H"+
		"\27\3\2\2\2IL\5\24\13\2JL\5\26\f\2KI\3\2\2\2KJ\3\2\2\2L\31\3\2\2\2MN\7"+
		"\7\2\2NO\5 \21\2OP\7\7\2\2P\33\3\2\2\2QR\7\t\2\2RS\5\32\16\2S\35\3\2\2"+
		"\2TW\5\32\16\2UW\5\34\17\2VT\3\2\2\2VU\3\2\2\2W\37\3\2\2\2XY\t\4\2\2Y"+
		"!\3\2\2\2\7,>BKV";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}