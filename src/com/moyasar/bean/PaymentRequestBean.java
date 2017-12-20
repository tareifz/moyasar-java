package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class PaymentRequestBean {
	
	public PaymentRequestBean() {
		
	}
	
	public PaymentRequestBean(int amount, String currency, String description, SourceRequest source, String callbackUrl)
	{
		this.setAmount(amount);
		this.setCurrency(currency);
		this.setDescription(description);
		this.setSource(source);
		this.setCallbackUrl(callbackUrl);
	}
	
	/**
	 * positive integer		A positive integer in the smallest currency unit
	 * (e.g 100 cents to charge $1.00, or 1 to charge ¥1, a 0-decimal currency) 
	 * representing how much to charge the card. The minimum amount is $0.50 (or equivalent in charge currency).
	 * **/
	@SerializedName("amount")
	private int amount;
	/**
	 * string	SAR	3-letter ISO code for currency.
	 * **/
	@SerializedName("currency")
	private String currency;
	/**
	 * String	null	An arbitrary string which you can attach to a payment object.
	 * It is displayed when in the web interface alongside the charge. Note that if you use Moyasar to send automatic email receipts to your customers,
	 * your receipt email will include the description of the payment(s) that they are describing.
	 * */
	@SerializedName("description")
	private String description;
	
	@SerializedName("source")
	private SourceRequest source;
	
	@SerializedName("callback_url")
	private String callback_url;
		
	public SourceRequest getSource() {
		return source;
	}
	
	public PaymentRequestBean setSource(SourceRequest source){
		if(source == null) throw new IllegalArgumentException("Source can't be null!");
		
		this.source = source;
		
		return this;
	}
		
	public double getAmount() {
		return amount;
	}
	
	public PaymentRequestBean setAmount(int amount) {
		if (amount < 100) throw new IllegalArgumentException("Payment Amount Must be larger than 100!");
		
		this.amount = amount;
		
		return this;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public PaymentRequestBean setCurrency(String currency) {
		if(currency.isEmpty()) throw new IllegalArgumentException("Currency can't be empty!");
		
		this.currency = currency;
		
		return this;
	}
	
	public String getDescription() {
		return description;
	}
	
	public PaymentRequestBean setDescription(String description) {
		this.description = description;
		
		return this;
	}
	
	public String getCallbackUrl() {
		return callback_url;
	}
	
	public PaymentRequestBean setCallbackUrl(String url) {
		if(url.length() < 10) throw new IllegalArgumentException("URL must 10 or more characters");
		
		this.callback_url = url;
		
		return this;
	}

}
