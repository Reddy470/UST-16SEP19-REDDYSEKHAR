package com.ustglobal.librarymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;
import com.ustglobal.librarymanagement.dto.BookResponse;
import com.ustglobal.librarymanagement.dto.Registration;
import com.ustglobal.librarymanagement.service.LibraryService;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class LibraryActionController {

	@Autowired
	private LibraryService service;

	@PostMapping(path = "/reg" ,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean regSave(@RequestBody Registration registration) {


		return service.userSave(registration);
	}

	@PostMapping(path ="/login", 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Registration loginUser(@RequestBody Registration reg) {
		System.out.println("name in action::"+reg.getName());
		System.out.println("pass in action::"+reg.getPwd());
		String name = reg.getName();
		String pwd  = reg.getPwd();

		try {
			Registration r = service.loginUser(name , pwd);
			System.out.println("my type::"+r.getType());
			return r;

		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	@PutMapping(path = "/addbook" ,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addBook(@RequestBody AddBook bean) {

		return service.addBook(bean);
	}


	@DeleteMapping(path = "/delete/{bid}",produces = MediaType.APPLICATION_JSON_VALUE)

	public BookResponse deleteBook(@PathVariable("bid") int bid) {
		BookResponse response = new BookResponse();
		if(service.deleteBook(bid)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data delete from  the DB");

		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not delete from  the DB");
		}

		return response;


	}// end of deletemethod()


	@GetMapping(path = "getall",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AddBook> getAllBook(){

		
		List<AddBook> bean = service.getAllBooks();


		if(!bean.isEmpty()) {
			
			return bean;
		}else {
			
			return null;
		}





	}// end of getAllEmployee()



	@PutMapping(path = "/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public BookResponse updateBook(@RequestBody AddBook bean) {

		BookResponse response = new BookResponse();
		if(service.updateBook(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data modify to  the DB");

		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not modify to  the DB");
		}


		return response;
	}// end of modifyEmployee()

	@DeleteMapping(path = "/deletestudent/{sno}",produces = MediaType.APPLICATION_JSON_VALUE)

	public BookResponse deleteStudent(@PathVariable("sno") int sno) {
		BookResponse response = new BookResponse();
		if(service.deleteStudent(sno)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data delete from  the DB");

		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not delete from  the DB");
		}

		return response;


	}// end of deletemethod()

	@GetMapping(path = "userdetails",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Registration> getAlldetails(){

		
		List<Registration> bean = service.getAlldetails();


		if(!bean.isEmpty()) {
			
			return bean;
		}else {
			
			return null;
		}
	}// end of getAllDetails()
	

	@PostMapping(path="/approve", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean approved(@RequestBody BookRequest req) {
		
		
		return service.approve(req);
	}
	
	@DeleteMapping(path="/reject/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean rejected(@PathVariable("id") int id) {
		System.out.println("id in reject::"+id);
		
		return service.reject(id);
	}

}


