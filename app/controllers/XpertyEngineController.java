package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.fasterxml.jackson.core.type.TypeReference;

import engine.RuleChecker;
import grammar.XpertyLexer;
import grammar.XpertyParser;
import grammar.XpertyParser.Rule_startContext;
import models.Attribute;
import models.AttributeAnswer;
import models.Rule;
import models.RuleCondition;
import models.RuleResult;
import models.Value;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class XpertyEngineController extends Controller{

	public static Result checkRules() throws IOException{
		List<RuleResult> matchedRules = new ArrayList<>();
		for (Rule rule : Rule.list()) {
			ANTLRInputStream antlrInputStream = new ANTLRInputStream(rule.getExpression());
			XpertyLexer lexer = new XpertyLexer(antlrInputStream);
			XpertyParser parser = new XpertyParser(new CommonTokenStream(lexer));
			Rule_startContext ctx = parser.rule_start();

			List<RuleCondition> ruleConditions = getRuleConditions();
			Object actual = new RuleChecker(ruleConditions).visitRule_start(ctx);
			if(actual != null){
				matchedRules.add((RuleResult) actual);
			}
		}
		
		return ok(Json.toJson(matchedRules));
	}

	private static List<RuleCondition> getRuleConditions() throws IOException {
		List<AttributeAnswer> attributeAnswers = JsonParser.bindFromRequest(new TypeReference<List<AttributeAnswer>>(){});
		List<RuleCondition> ruleConditions = new ArrayList<>();
		for (AttributeAnswer attributeAnswer : attributeAnswers) {
			Attribute found = Attribute.find(attributeAnswer.getIdAttribute());
			Value value = new Value(found.getValueType(), attributeAnswer.getAnswer());
			RuleCondition ruleCondition = new RuleCondition(found.getName(), value);
			ruleConditions.add(ruleCondition);
		}
		return ruleConditions;
	}
}
