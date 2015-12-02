package controllers;

import com.avaje.ebean.Ebean;

import models.Attribute;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class AttributeController extends Controller{
	
	public static Result list(){
		return ok(Json.toJson(Attribute.list()));
	}
	
	public static Result get(Long id){
		return ok(Json.toJson(Attribute.find(id)));
	}
	
	public static Result add(){
		Attribute attributeToAdd = JsonParser.bindFromRequest(Attribute.class);
		attributeToAdd.save();
		return ok(Json.toJson(attributeToAdd));
	}

	public static Result update(Long id){
		Attribute attributeToUpdate = JsonParser.bindFromRequest(Attribute.class);
		attributeToUpdate.update();
		return ok(Json.toJson(attributeToUpdate));
	}
	
	public static Result remove(Long id){
		Attribute attributeToRemove = Attribute.find(id);
		Ebean.delete(attributeToRemove);
		return list();
	}
	

}
