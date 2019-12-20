package com.ustglobal.bootwithhibernate.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.bootwithhibernate.dto.Product;
import com.ustglobal.bootwithhibernate.dto.ProductOrder;
import com.ustglobal.bootwithhibernate.dto.ProductResponse;
import com.ustglobal.bootwithhibernate.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")

@RestController
public class ProductController {

	@Autowired
	private ProductService service ;

	@PostMapping(path = "add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody Product product) {


		return service.addProduct(product);
	}// end of addProduct()

	
	
	@PutMapping(path = "/update",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)

	public boolean updateBook(@RequestBody Product product) {
		return service.updateProduct(product);

		
	}// end of modifyEmployee()

	
	@GetMapping(path="/search",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Product searchProductInfo(@RequestParam("name") String name) {

		return service.searchProductByName(name);

	}// end of search()


	@GetMapping(path = "getall",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct(){


		List<Product> bean = service.getAllProduct();


		if(!bean.isEmpty()) {

			return bean;
		}else {

			return null;
		}

	}// end of getproduct()

	@GetMapping(name = "/category",produces = MediaType.APPLICATION_JSON_VALUE)

	public List<Product> getProductByCatagory(String catagory){

		List<Product> bean = service.getProductByCatagory(catagory);

		if(!bean.isEmpty()) {
			return bean;
		}else {
			return null;
		}

	}// end of getProductByCatagory()
	
	@GetMapping(path="/searchcompany",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Product searchProductCompany(@RequestParam("company") String company) {

		return service.searchProductByCompany(company);

	}// end of search()

	@PostMapping(path = "/addorder",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addProduct(@RequestBody ProductOrder productOrder) {


		return service.addProduct(productOrder);
	}// end of add()
}
