package com.moyasar.bean;

public class PaymentResponseBean {
	
	private String id; 
	private String status;
	private double amount; 
	private String currency;
	private String description;	//payment description
	private String invoice_id;
	private double fee;
	private String amountFormat; 
	private String feeFormat;
	private String invoiceID;
	private String ip;
	private String createdOn;
	private String updatedON;
	
  	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getAmountFormat() {
		return amountFormat;
	}
	public void setAmountFormat(String amountFormat) {
		this.amountFormat = amountFormat;
	}
	public String getFeeFormat() {
		return feeFormat;
	}
	public void setFeeFormat(String feeFormat) {
		this.feeFormat = feeFormat;
	}
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedON() {
		return updatedON;
	}
	public void setUpdatedON(String updatedON) {
		this.updatedON = updatedON;
	}
	
	
}
