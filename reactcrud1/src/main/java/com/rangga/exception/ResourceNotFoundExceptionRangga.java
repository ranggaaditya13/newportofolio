package com.rangga.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExceptionRangga extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionRangga(String message) {
		super();
	}

}
