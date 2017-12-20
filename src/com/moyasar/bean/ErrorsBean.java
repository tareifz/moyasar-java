package com.moyasar.bean;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;

public class ErrorsBean {

	@SerializedName("type")
	private String type; 
	@SerializedName("message")
	private String message; 
	@SerializedName("errors")
	private String errors;

	public ErrorsBean(String JSONSTREEM){
		JsonParser parser = new JsonParser(); 
		JsonElement jsonTree = parser.parse(JSONSTREEM);
		JsonObject  jobject = jsonTree.getAsJsonObject();
		setType(jobject.getAsJsonPrimitive("type").getAsString());
		setMessage(jobject.getAsJsonPrimitive("message").getAsString());
		
		if(jobject.get("errors").isJsonNull())
		{
			setErrors(null);
		}
		else if (jobject.get("errors").isJsonObject())
		{
			jobject =  jobject.getAsJsonObject("errors");
			setErrors(jobject.toString());
		}
		else if(jobject.get("errors").isJsonPrimitive())
		{
			setErrors(jobject.getAsJsonPrimitive("errors").getAsString());
		}

	}


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;

	}


	public String getErrors() {
		return errors;
	}


	public void setErrors(String errors) {
		this.errors = errors;
	}


	@Override
	public String toString() {
		return "ErrorsBean [type=" + type + ", message=" + message + ", errors=" + errors + "]";
	}




}
