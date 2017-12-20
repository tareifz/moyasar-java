package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public abstract class SourceRequest {
	
	@SerializedName("type")
	protected String type;
	
	public String getType()
	{
		return type;
	}
	
	protected SourceRequest setType(String type)
	{
		if(type.isEmpty()) throw new IllegalArgumentException("type can't be empty!");
		
		this.type = type;
		
		return this;
	}
	
}
