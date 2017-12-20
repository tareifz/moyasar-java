package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class InvoiceRequestBean
{
	
	@SerializedName("amount")
	private int amount;
	
	@SerializedName("currency")
	private String currency;
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("callback_url")
	private String callbackUrl = "";

	public InvoiceRequestBean()
	{
		
	}
	
	public InvoiceRequestBean(int amount, String currency, String description)
	{
		this(amount, currency, description, "");
	}
	
	public InvoiceRequestBean(int amount, String currency, String description, String callbackUrl)
	{
		setAmount(amount);
		setCurrency(currency);
		setDescription(description);
		setCallbackUrl(callbackUrl);
	}
	
	public InvoiceRequestBean setAmount(int amount)
	{
		if(amount < 100) throw new IllegalArgumentException("Amount must be larger than 100!");
		
		this.amount = amount;
		
		return this;
	}
	
	public InvoiceRequestBean setCurrency(String currency)
	{
		if(currency.isEmpty()) throw new IllegalArgumentException("Currency can't be empty!");
		
		this.currency = currency;
		
		return this;
	}
	
	public InvoiceRequestBean setDescription(String description)
	{
		if(description.isEmpty()) throw new IllegalArgumentException("Description can't be empty!");
		
		this.description = description;
		
		return this;
	}
	
	public InvoiceRequestBean setCallbackUrl(String callbackUrl)
	{
		if(!callbackUrl.isEmpty() && callbackUrl.length() < 10) throw new IllegalArgumentException("Callback_url is too short (minimum is 10 characters)!");
		
		this.callbackUrl = callbackUrl;
		
		return this;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public String getDescription() {
		return description;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}
	
	
	
	
}
