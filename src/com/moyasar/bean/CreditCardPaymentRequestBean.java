package com.moyasar.bean;

public class CreditCardPaymentRequestBean extends PaymentRequestBean{
	
	/**
	 * The type of payment source. Should be “creditcard”
	 */
	public static final String type = "creditcard";
	/**
	 * Card holder’s name
	 */
	private String name; 
	/**
	 * The card number
	 */
	private int number;  
	/**
	 * Card security code.
	 * */
	private int cvc;
	
	/**
	 * 	Two digit number representing the card’s expiration month.
	 */
	 private int month;
	
	 /**
	 * 	Four digit number representing the card’s expiration year.
	 */
	 private int year;	 
	 
	 
	 
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static String getType() {
		return type;
	}
		

	
}
