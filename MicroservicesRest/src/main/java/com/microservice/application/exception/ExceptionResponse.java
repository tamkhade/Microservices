package com.microservice.application.exception;

import java.util.Date;

public class ExceptionResponse {

	private String details;
	
	private String message;
	
	private Date timestamp;

	public String getDetails() {
		return details;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [details=" + details + ", message=" + message + ", timestamp=" + timestamp
				+ ", getDetails()=" + getDetails() + ", getMessage()=" + getMessage() + ", getTimestamp()="
				+ getTimestamp() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public ExceptionResponse(String details, String message, Date timestamp) {
		super();
		this.details = details;
		this.message = message;
		this.timestamp = timestamp;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
