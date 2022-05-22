package com.elearn.Exceptions;

import java.io.Serializable;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
public class ApiException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private HttpStatus httpstatus;
	private List<String> errors;

}
