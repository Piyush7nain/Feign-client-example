package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleCustomerNotFoundException(CustomerNotFoundException ex){
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND.value(), ex.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}

}
