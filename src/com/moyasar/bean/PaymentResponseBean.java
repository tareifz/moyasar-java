package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;


public class PaymentResponseBean extends Response {
	
	@SerializedName("id")
	private String id; 
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("amount")
	private double amount;
	
	@SerializedName("fee")
	private double fee;
	
	@SerializedName("currency")
	private String currency;
	
	@SerializedName("refunded")
	private double refunded;
	
	@SerializedName("refunded_at")
	private String refunded_at;
	
	@SerializedName("description")
	private String description;	//payment description
	
	@SerializedName("amount_format")
	private String amountFormat; 
	
	@SerializedName("fee_format")
	private String feeFormat;
	
	@SerializedName("refunded_format")
	private String refundedFormat;
	
	@SerializedName("invoice_id")
	private String invoiceID;
	
	@SerializedName("ip")
	private String ip;
	
	@SerializedName("callback_url")
	private String callbackUrl;
	
	@SerializedName("created_at")
	private String createdOn;
	
	@SerializedName("updated_at")
	private String updatedON;
	
	@SerializedName("source")
	private SourceResponse source;
    
	public SourceResponse getSource() {
		return source;
	}
	
	public String getId() {
		return id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getRefunded() {
		return refunded;
	}
	
	public String getRefunded_at() {
		return refunded_at;
	}
	
	public String getCurrency() {
		return currency;
	}
	public String getDescription() {
		return description;
	}
	
	public double getFee() {
		return fee;
	}
	
	public String getAmountFormat() {
		return amountFormat;
	}
	
	public String getFeeFormat() {
		return feeFormat;
	}
	
	public String getRefundedFormat() {
		return refundedFormat;
	}
	
	public String getInvoiceID() {
		return invoiceID;
	}
	
	public String getIp() {
		return ip;
	}
	
	public String getCallbackUrl() {
		return callbackUrl;
	}
	
	public String getCreatedOn() {
		return createdOn;
	}
	
	public String getUpdatedON() {
		return updatedON;
	}
	
	@Override
	public String toString() {
		return "PaymentResponseBean [id=" + id + ", status=" + status + ", amount=" + amount + ", currency=" + currency
				+ ", description=" + description + ", fee=" + fee + ", refunded=" + refunded + ", refunded_at="
				+ refunded_at + ", amountFormat=" + amountFormat + ", feeFormat=" + feeFormat + ", invoiceID="
				+ invoiceID + ", ip=" + ip + ", createdOn=" + createdOn + ", updatedON=" + updatedON + ", source"
				+ getSource().toString() + "]";
	}
	
	
	
	
	
	
	
	
	
//	@Override
//	public String toString() {
//		return "PaymentResponseBean [id=" + id + ", status=" + status + ", amount=" + amount + ", currency=" + currency
//				+ ", description=" + description + ", fee=" + fee + ", amountFormat=" + amountFormat + ", feeFormat="
//				+ feeFormat + ", invoiceID=" + invoiceID + ", ip=" + ip + ", createdOn=" + createdOn + ", updatedON="
//				+ updatedON + ", source=" + source + "]";
//	}
	
	
	
	
}
