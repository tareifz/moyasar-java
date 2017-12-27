package com.moyasar.bean;

public class MoyasarException extends Exception {
	
	private int statusCode;
	private String message;
	private String errorType;
	private String errors;

	public MoyasarException(int code, String message, String type, String errors) {
		this.statusCode = code;
		this.message = message;
		this.errorType = type;
		this.errors = errors;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCose) {
		this.statusCode = statusCose;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}
	
	public String toString() {
		return "Status Code: " + statusCode + "\nMessage: " + message + "\nError Type: " + errorType
				+ "\nErrors: " + errors;
	}
	
}
