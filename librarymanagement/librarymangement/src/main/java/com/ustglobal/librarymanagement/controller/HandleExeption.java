package com.ustglobal.librarymanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.librarymanagement.dto.BookResponse;

@RestControllerAdvice
public class HandleExeption {
	
	@ExceptionHandler(Exception.class)
	
	public  BookResponse getException() {
		
		BookResponse response = new BookResponse();
		response.setStatuscode(501);
		response.setMessage(" Error in Code");
		response.setDescription("Got on exception");
		return response;
	}

}
