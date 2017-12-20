package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class InvoiceUpdateRequestBean {

	@SerializedName("amount")
	private int amount;
	
	@SerializedName("currency")
	private String currency;
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("callback_url")
	private String callbackUrl = null;

	public InvoiceUpdateRequestBean()
	{
		
	}
	
	public InvoiceUpdateRequestBean(int amount, String currency, String description)
	{
		this(amount, currency, description, null);
	}
	
	public InvoiceUpdateRequestBean(int amount, String currency, String description, String callbackUrl)
	{
		this.amount = amount;
		this.currency = currency;
		this.description = description;
		this.callbackUrl = callbackUrl;
	}

	public int getAmount() {
		return amount;
	}

	public InvoiceUpdateRequestBean setAmount(int amount) {
		this.amount = amount;
		
		return this;
	}

	public String getCurrency() {
		return currency;
	}

	public InvoiceUpdateRequestBean setCurrency(String currency) {
		this.currency = currency;
		
		return this;
	}

	public String getDescription() {
		return description;
	}

	public InvoiceUpdateRequestBean setDescription(String description) {
		this.description = description;
		
		return this;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public InvoiceUpdateRequestBean setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		
		return this;
	}
	
}
