package com.ustglobal.webapp.repo;

import org.springframework.stereotype.Repository;

import com.ustglobal.webapp.beans.Product;
import com.ustglobal.webapp.beans.Retailer;
@Repository
public interface ServiceDAO {
	
	
	public int createProfile(Retailer bean);
	public Retailer login (int id, String password);
	public Product searcheProduct(int id);
	public boolean changePassword(int id,String password);
	public Product buyOneProduct(int bid);

}
