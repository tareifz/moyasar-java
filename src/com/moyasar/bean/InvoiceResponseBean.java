package com.moyasar.bean;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class InvoiceResponseBean extends Response {
	
	@SerializedName("id")
	private String id;
	
	@SerializedName("status")
	private String status;
	
	@SerializedName("amount")
	private int amount;
	
	@SerializedName("currency")
	private String currency;
	
	@SerializedName("description")
	private String description;
	
	@SerializedName("logo_url")
	private String logoUrl;
	
	@SerializedName("amount_format")
	private String amountFormat;
	
	@SerializedName("url")
	private String url;
	
	@SerializedName("created_at")
	private String createdAt;
	
	@SerializedName("updated_at")
	private String updatedAt;
	
	@SerializedName("payments")
	private ArrayList<PaymentResponseBean> payments;
	
	@SerializedName("callback_url")
	private String callbackUrl;

	public String getId() {
		return id;
	}

	public String getStatus() {
		return status;
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

	public String getLogoUrl() {
		return logoUrl;
	}

	public String getAmountFormat() {
		return amountFormat;
	}

	public String getUrl() {
		return url;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public ArrayList<PaymentResponseBean> getPayments() {
		return payments;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}
	
	public String toString() {
		return "{\nid: " + id + ",\nstatus: " + status + ",\namount: " + amount + ",\ncurrency: " + currency
				+ ",\ndescription: " + description + ",\nlogo_url: " + logoUrl + ",\namount_format: " + amountFormat
				+ ",\nurl: " + url + ",\ncreated_at: " + createdAt + ",\nupdated_at: " + updatedAt + ",\ncallback_url: "
				+ callbackUrl + ",\n}";
	}

}
