package com.moyasar.bean;

public class SadadPaymentResponseBean extends PaymentResponseBean{

	private String username; //sadad’s username
	private String errorCode; 
	private String message;
	private String transactionURL;
	
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransactionURL() {
		return transactionURL;
	}
	public void setTransactionURL(String transactionURL) {
		this.transactionURL = transactionURL;
	}
	
	@Override
	public String toString() {
		return "SadadPaymentResponseBean [username=" + username + ", errorCode=" + errorCode + ", message=" + message
				+ ", transactionURL=" + transactionURL + ", getId()=" + getId() + ", getStatus()=" + getStatus()
				+ ", getAmount()=" + getAmount() + ", getCurrency()=" + getCurrency() + ", getDescription()="
				+ getDescription() + ", getInvoice_id()=" + getInvoice_id() + ", getFee()=" + getFee()
				+ ", getAmountFormat()=" + getAmountFormat() + ", getFeeFormat()=" + getFeeFormat()
				+ ", getInvoiceID()=" + getInvoiceID() + ", getIp()=" + getIp() + ", getCreatedOn()=" + getCreatedOn()
				+ ", getUpdatedON()=" + getUpdatedON() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
