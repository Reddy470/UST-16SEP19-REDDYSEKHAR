package com.ustglobal.bootwithhibernate.dao;

import java.util.List;

import com.ustglobal.bootwithhibernate.dto.Product;
import com.ustglobal.bootwithhibernate.dto.ProductOrder;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public Product searchProductByName(String name);
	public List<Product> getProductByCatagory(String catagory);
	public List<Product> getAllProduct();
	public Product searchProductByCompany(String company);
	public boolean addProduct(ProductOrder productOrder);

}
