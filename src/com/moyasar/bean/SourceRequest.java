package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class SourceRequest {
	
	@SerializedName("type")
	protected String type;
	
	// Sadad Attributes.. 
	@SerializedName("username")
	protected String username; //sadad’s username
	@SerializedName("success_url")
	protected String successUrl; 
	@SerializedName("fail_url")
	protected String failUrl;
	
	// Credit Card attribute
	@SerializedName("name")
	protected String name;
	@SerializedName( "number")
	protected String number; 
	@SerializedName("cvc")
	protected String cvc;
	@SerializedName("month")
	protected String month;
	@SerializedName("year")
	protected String year;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSuccessUrl() {
		return successUrl;
	}
	public void setSuccessUrl(String successUrl) {
		this.successUrl = successUrl;
	}
	public String getFailUrl() {
		return failUrl;
	}
	public void setFailUrl(String failUrl) {
		this.failUrl = failUrl;
	}
	
	
//	public void setPaymentTypeObj(){
//		if (this.type.equals("creditcard")) {
//			new CreditCardPaymentRequestBean(this);
//		}else if(this.type.equals("sadad")){
//			new SadadPaymentRequestBean(this);
//		}else {
//			throw new IllegalArgumentException("Uknown Source Type");
//		}
//	}
//
//

	


	
	

}
