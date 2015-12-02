package controllers;

import com.avaje.ebean.Ebean;

import models.Rule;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class RuleController extends Controller{
	
	public static Result list(){
		return ok(Json.toJson(Rule.list()));
	}
	
	public static Result get(Long id){
		return ok(Json.toJson(Rule.find(id)));
	}
	
	public static Result add(){
		Rule ruleToAdd = JsonParser.bindFromRequest(Rule.class);
		ruleToAdd.save();
		return ok(Json.toJson(ruleToAdd));
	}
	
	public static Result update(Long id){
		Rule ruleToUpdate = JsonParser.bindFromRequest(Rule.class);
		ruleToUpdate.update();
		return ok(Json.toJson(ruleToUpdate));
	}
	
	public static Result remove(Long id){
		Rule ruleToRemove = Rule.find(id);
		Ebean.delete(ruleToRemove);
		return list();
	}
}
