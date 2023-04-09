package com.adobe.Exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> user_Exception(UserException e, WebRequest req) {
		
		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
	}
	
	
//	@ExceptionHandler(FIRException.class)
//	public ResponseEntity<MyErrorDetails> user_Exception(FIRException e, WebRequest req) {
//		
//		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));
//		
//		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
//	}
//	
//	
//	@ExceptionHandler(CurrentUserException.class)
//	public ResponseEntity<MyErrorDetails> user_Exception(CurrentUserException e, WebRequest req) {
//
//		MyErrorDetails myErrorDetails = new MyErrorDetails(LocalDate.now(), e.getMessage(), req.getDescription(false));
//
//		return new ResponseEntity<MyErrorDetails>(myErrorDetails, HttpStatus.BAD_REQUEST);
//	}
}	
