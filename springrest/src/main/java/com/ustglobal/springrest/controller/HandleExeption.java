package com.ustglobal.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springrest.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleExeption {
	
	@ExceptionHandler(Exception.class)
	
	public  EmployeeResponse getException() {
		
		EmployeeResponse response = new EmployeeResponse();
		response.setStatuscode(501);
		response.setMessage(" Error in Code");
		response.setDescription("Got on exception");
		return response;
	}

}
