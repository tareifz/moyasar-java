package com.moyasar.bean;

public abstract class PaymentRequestBean {
	
	/**
	 * positive integer		A positive integer in the smallest currency unit
	 * (e.g 100 cents to charge $1.00, or 1 to charge ¥1, a 0-decimal currency) 
	 * representing how much to charge the card. The minimum amount is $0.50 (or equivalent in charge currency).
	 * **/
	private double amount;
	/**
	 * string	SAR	3-letter ISO code for currency.
	 * **/
	private String currency;
	/**
	 * String	null	An arbitrary string which you can attach to a payment object.
	 * It is displayed when in the web interface alongside the charge. Note that if you use Moyasar to send automatic email receipts to your customers,
	 * your receipt email will include the description of the payment(s) that they are describing.
	 * */
	private String description;
		

		
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		if (amount > 0)
			this.amount = amount;
		else {
			throw new IllegalArgumentException("Payment Amount Must be Positive Value");
		}
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
