package com.moyasar.bean;

public class CreditCardResponse extends SourceResponse {
	
	public CreditCardResponse(SourceResponse source) {
		this.company = source.company;
		this.number = source.number;
		this.errorCode = source.errorCode;
		this.message = source.message;
		this.name = source.name;
		this.transactionURL = source.transactionURL;
		this.type = source.type;
		this.username = source.username;
	}

	public String getName() {
		return name;
	}


	public String getCompany() {
		return company;
	}


	public String getNumber() {
		return number;
	}


	@Override
	public String toString() {
		return "CreditCardResponse [type=" + type + ", name=" + name + ", message=" + message + ", cardNetwork="
				+ company + ", cardNumber=" + number + ", transactionURL=" + transactionURL + "]";
	}

	
}
