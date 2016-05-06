package com.moyasar.bean;

public class SadadPaymentRequestBean extends PaymentRequestBean{
	
	public static final String type = "sadad";
	
	public String username; //sadad’s username
	public String success_url; //optional	success url page in customer ’s site. Use Moyasar’s success url if not given.
	public String fail_url; //optional	fail url page in customer ’s site. Use Moyasar’s fail url if not given.
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSuccess_url() {
		return success_url;
	}
	public void setSuccess_url(String success_url) {
		this.success_url = success_url;
	}
	public String getFail_url() {
		return fail_url;
	}
	public void setFail_url(String fail_url) {
		this.fail_url = fail_url;
	}
	public static String getType() {
		return type;
	}
	
	
	@Override
	public String toString() {
		return "SadadPaymentRequestBean [username=" + username + ", success_url=" + success_url + ", fail_url="
				+ fail_url + ", getAmount()=" + getAmount() + ", getCurrency()=" + getCurrency() + ", getDescription()="
				+ getDescription() + "]";
	}
	
	
	
	
	
}
