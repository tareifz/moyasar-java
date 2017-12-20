package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class SadadSourceRequest extends SourceRequest {
	
	@SerializedName("username")
	protected String username; //sadad’s username
	
	@SerializedName("success_url")
	protected String successUrl;
	
	@SerializedName("fail_url")
	protected String failUrl;
	
	public SadadSourceRequest(String username, String success_url, String fail_url)
	{
		this.setType("sadad");
		this.setUsername(username);
		this.setSuccessUrl(success_url);
		this.setFailUrl(fail_url);
	}
	
	public SadadSourceRequest()
	{
		this.setType("sadad");
//		this.username = "";
//		this.successUrl = "https://moyasar.com/";
//		this.failUrl = "https://moyasar.com/";
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public SadadSourceRequest setUsername(String username)
	{
		if(username.isEmpty()) throw new IllegalArgumentException("Username can't be empty!");
		
		this.username = username;
		
		return this;
	}
	
	public String getSuccessUrl()
	{
		return successUrl;
	}
	
	public SadadSourceRequest setSuccessUrl(String successUrl)
	{
		if(successUrl.length() < 10) throw new IllegalArgumentException("Success URL must be longer than 10 characters!");
		
		this.successUrl = successUrl;
		
		return this;
	}
	
	public String getFailUrl()
	{
		return failUrl;
	}
	
	public SadadSourceRequest setFailUrl(String failUrl)
	{
		if(failUrl.length() < 10) throw new IllegalArgumentException("Fail URL must be longer than 10 characters!");
		
		this.failUrl = failUrl;
		
		return this;
	}

}
