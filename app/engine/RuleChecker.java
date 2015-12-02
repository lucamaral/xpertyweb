package engine;

import java.util.ArrayList;
import java.util.List;

import grammar.XpertyBaseVisitor;
import grammar.XpertyParser.Rule_conditionContext;
import grammar.XpertyParser.Rule_startContext;
import models.RuleCondition;
import models.RuleResult;

public class RuleChecker extends XpertyBaseVisitor<Object> {

	private List<RuleCondition> ruleConditions = new ArrayList<>();
	private boolean missingRuleCondition = false;

	public RuleChecker(List<RuleCondition> ruleConditions) {
		super();
		this.ruleConditions = ruleConditions;
		this.missingRuleCondition = false;
	}

	@Override
	public Object visitRule_start(Rule_startContext ctx) {
		super.visitRule_start(ctx);
		if (missingRuleCondition) {
			return null;
		} else {
			String attribute = escapeQuotation(ctx.rule_result().attribute().getText());
			String value = escapeQuotation(ctx.rule_result().value().getText());
			return new RuleResult(attribute, value);
		}
	}

	@Override
	public Object visitRule_condition(Rule_conditionContext ctx) {
		String attribute = escapeQuotation(ctx.attribute().getText());
		String value = escapeQuotation(ctx.value().getText());
		String conditional = ctx.conditional().getText();
		if (hasMatchRule(attribute, value, conditional)) {
			return super.visitRule_condition(ctx);
		} else {
			missingRuleCondition = true;
			return null;
		}
	}

	private boolean hasMatchRule(String attribute, String value, String conditional) {
		switch (conditional) {
		case "=":
			return checkEquals(attribute, value);
		case "<>":
			return checkNotEquals(attribute, value);
		case ">":
			return greaterThan(attribute, value);
		case ">=":
			return greaterOrEqualThan(attribute, value);
		case "<":
			return lowerThan(attribute, value);
		case "<=":
			return lowerOrEqualThan(attribute, value);
		}
		return false;
	}

	private boolean checkEquals(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (ruleCondition.checkEquals(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkNotEquals(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (!ruleCondition.checkEquals(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean greaterThan(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (ruleCondition.greaterThan(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean greaterOrEqualThan(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (ruleCondition.greaterOrEqualThan(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean lowerThan(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (ruleCondition.lowerThan(value)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean lowerOrEqualThan(String attribute, String value) {
		for (RuleCondition ruleCondition : ruleConditions) {
			if (ruleCondition.getAttribute().equals(attribute)) {
				if (ruleCondition.lowerOrEqualThan(value)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private String escapeQuotation(String quoted){
		return quoted.replaceAll("'", "");
	}
}
