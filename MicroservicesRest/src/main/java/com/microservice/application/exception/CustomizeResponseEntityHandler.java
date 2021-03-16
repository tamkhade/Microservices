package com.microservice.application.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.microservice.application.services.UserNotFountException;

@RestControllerAdvice
@RestController
public class CustomizeResponseEntityHandler extends ResponseEntityExceptionHandler{

     @ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		ExceptionResponse exceptionResponse = new ExceptionResponse(request.getDescription(false),ex.getMessage(),new Date());
    return new ResponseEntity<Object>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
     }
     
     
     @ExceptionHandler(UserNotFountException.class)
 	public final ResponseEntity<Object> userNotFoundException(UserNotFountException ex, WebRequest request) throws Exception {
 		ExceptionResponse exceptionResponse = 
 				new ExceptionResponse(request.getDescription(false),
 						             ex.getMessage(),
 						             new Date());
 			return new ResponseEntity<Object>(exceptionResponse,HttpStatus.NOT_FOUND);
      }
	
     
     /**
 	 * Customize the response for MethodArgumentNotValidException.
 	 * <p>This method delegates to {@link #handleExceptionInternal}.
 	 * @param ex the exception
 	 * @param headers the headers to be written to the response
 	 * @param status the selected response status
 	 * @param request the current request
 	 * @return a {@code ResponseEntity} instance
 	 */
     @Override
 	protected ResponseEntity<Object> handleMethodArgumentNotValid(
 			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    	 ExceptionResponse exceptionResponse = 
  				new ExceptionResponse(ex.getBindingResult().toString(),
  						             //ex.getBindingResult().toString(),
  						            "validation fialed",
  						             new Date());
  			return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
 	}
	
}
