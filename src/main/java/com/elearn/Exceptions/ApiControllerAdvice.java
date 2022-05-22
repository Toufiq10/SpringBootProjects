package com.elearn.Exceptions;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {
	
	@ExceptionHandler(ApiException.class)
	public ResponseEntity<Object> handliApiException(ApiException apiexception){
		return new ResponseEntity<Object>(apiexception.getErrors(), apiexception.getHttpstatus());
	}

}
