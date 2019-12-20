package com.ustglobal.bootwithhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.bootwithhibernate.dao.ProductDAO;
import com.ustglobal.bootwithhibernate.dto.Product;
import com.ustglobal.bootwithhibernate.dto.ProductOrder;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(Product product) {
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		return dao.updateProduct(product);
	}

	
	
	

	@Override
	public Product searchProductByName(String name) {
		return dao.searchProductByName(name);
	}

	
	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	
	@Override
	public List<Product> getProductByCatagory(String catagory) {
		// TODO Auto-generated method stub
		return dao.getProductByCatagory(catagory);
	}

	@Override
	public Product searchProductByCompany(String company) {
		// TODO Auto-generated method stub
		return dao.searchProductByCompany(company);
	}

	
	@Override
	public boolean addProduct(ProductOrder productOrder) {
		// TODO Auto-generated method stub
		return dao.addProduct(productOrder);
	}

	

}
