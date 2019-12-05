package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.dto.EmployeeResponse;
import com.ustglobal.springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService Service;
	
	@PostMapping(path = "/add" ,
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE )
	public EmployeeResponse addEmployee( @RequestBody  EmployeeBean bean) {
		
		EmployeeResponse response = new EmployeeResponse();
		if(Service.addEmployee(bean)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data Added to  the DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not Added to  the DB");
			}
		
		return response;
		
	}//end of addEmployee()
	
	
	@PutMapping(path = "/modify",
					consumes = MediaType.APPLICATION_JSON_VALUE,
					produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponse modifyEmployee(@RequestBody EmployeeBean bean) {
		
		EmployeeResponse response = new EmployeeResponse();
		if(Service.modifyEmployee(bean)) {
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
	
	@DeleteMapping(path = "/delete/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponse deleteEmployee(@PathVariable("id") int id) {
		
		
		EmployeeResponse response = new EmployeeResponse();
		if(Service.deleteEmployee(id)) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data delete from  the DB");
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not delete from  the DB");
			}
		
		return response;
		
	} // end of deleteEmployee()
	
	@GetMapping(path = "/get" ,produces = MediaType.APPLICATION_JSON_VALUE)
	
	public EmployeeResponse getEmployee(@RequestParam("id") int id) {
		
		EmployeeResponse response = new EmployeeResponse();
		EmployeeBean bean = Service.getEmployee(id);
		
		
		if(bean!=null) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setEmployeeBeans(Arrays.asList(bean));
			
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not found  in  the DB");
			}
		
		return response;
		
		
	} // end of getEmployee()
	
	@GetMapping(path = "get-all",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getAllEmployee(){
		
		
		
		
		EmployeeResponse response = new EmployeeResponse();
		List<EmployeeBean> bean = Service.getAllEmployee();
		
		
		if(!bean.isEmpty()) {
			response.setStatuscode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setEmployeeBeans(bean);;
			
			
		}else {
			response.setStatuscode(401);
			response.setMessage("failure");	
			response.setDescription("Data  not found  in  the DB");
			}
		
		return response;
		
		
		
	}// end of getAllEmployee()
	
	@GetMapping(path = "/exce", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		
		int i = 1/0;
	}

	
	
	

}// end of EmployeeController
