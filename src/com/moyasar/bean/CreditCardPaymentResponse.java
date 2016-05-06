package com.moyasar.bean;

import com.moyasar.util.CardNetworks;

public class CreditCardPaymentResponse extends PaymentResponseBean{
	
	private static final String type = "creditcard";
	private String name;
	private String message; 
	private CardNetworks cardNetwork;
	
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public CardNetworks getCardNetwork() {
		return cardNetwork;
	}
	
	public void setCardNetwork(CardNetworks cardNetwork) {
		this.cardNetwork = cardNetwork;
	}
	
	public void setCardNetwork(String cardNetwork) {
		switch (cardNetwork.toLowerCase()) {
		case "visa":
			this.cardNetwork = CardNetworks.VISA;
			break;
		case "mastercard":
			this.cardNetwork = CardNetworks.MASTERCARD;
		case "amex":
		case "american express":
		case "americanepress":
			this.cardNetwork = CardNetworks.AMEX;
		default:
			throw new IllegalArgumentException("UNKNOWN CARD NETWORK COMPANEY " + cardNetwork);
		}
		
		
	}
	
	public static String getType() {
		return type;
	}
	
	
	
	
	

}
