package com.moyasar.bean;

public class SadadSourceResponse extends SourceResponse {
	
	public SadadSourceResponse(SourceResponse source) {
		this.company = source.company;
		this.number = source.number;
		this.errorCode = source.errorCode;
		this.message = source.message;
		this.name = source.name;
		this.transactionURL = source.transactionURL;
		this.type = source.type;
		this.username = source.username;
	}

	public String getUsername() {
		return username;
	}


	public String getErrorCode() {
		return errorCode;
	}


	public String getTransactionURL() {
		return transactionURL;
	}


	@Override
	public String toString() {
		return "SadadResponse [type=" + type + ", username=" + username + ", errorCode=" + errorCode
				+ ", transactionURL=" + transactionURL + ", message=" + message + "]";
	}


}
