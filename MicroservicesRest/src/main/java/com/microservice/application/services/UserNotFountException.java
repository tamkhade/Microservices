package com.microservice.application.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFountException extends RuntimeException {

	public UserNotFountException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

}
