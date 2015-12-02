package controllers;

import java.io.IOException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import play.data.Form;
import play.mvc.Controller;

public class JsonParser {
	
	public static <T> T bindFromRequest(Class<T> clazz) {
		Form<T> bindFromRequest = Form.form(clazz).bindFromRequest();
		return bindFromRequest.get();
	}
	
	public static <T> T bindFromRequest(final TypeReference<T> typeReference) throws IOException {
        final JsonNode jsonNode = Controller.request().body().asJson();
        return new ObjectMapper().readValue(jsonNode.traverse(), typeReference);
    }
	
}
