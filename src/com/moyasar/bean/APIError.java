package com.moyasar.bean;

import com.google.gson.annotations.SerializedName;

public class APIError {
	
	@SerializedName("code")
	private int statusCode;
	@SerializedName("type")
	private String errorType; 
	@SerializedName("message")
	private String message;

    public APIError() {
    }
    
   
    public int getStatusCode() {
		return statusCode;
	}

    
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
        return message;
    }
}
