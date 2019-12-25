package com.ustglobal.librarymanagement.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;
import com.ustglobal.librarymanagement.service.StudentService;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping(path = "/bookname", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public AddBook searchBookByName(@RequestParam("bname") String bname) {
		AddBook bean = null;
		try {
			bean = service.searchBookByName(bname);
			System.out.println(bean);
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}// end of serach()
	
	@PostMapping(path ="/request",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean bookrequest(@RequestBody BookRequest book) {
		
		
		return service.requestBook(book);
		
	}
	
	@GetMapping(path="/reqList",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BookRequest> bookRqList() {
		
		return service.reqList();
	}
	
	
	

}
	

