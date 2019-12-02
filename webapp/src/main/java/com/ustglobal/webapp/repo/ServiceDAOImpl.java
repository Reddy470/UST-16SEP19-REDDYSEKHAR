package com.ustglobal.webapp.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.webapp.beans.Retailer;
import com.ustglobal.webapp.dao.ProductDAO;

@Service

public class ServiceDAOImpl  implements ServiceDAO{
	
	@Autowired
	private ProductDAO  dao;

	@Override
	public int createProfile(Retailer bean) {
		// TODO Auto-generated method stub
		return dao.createProfile(bean);
	}

	@Override
	public Retailer login(int id, String password) {
		// TODO Auto-generated method stub
		return dao.login(id, password);
	}

	@Override
	public Retailer searcheProduct(int id) {
		// TODO Auto-generated method stub
		return dao.searcheProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(id, password);
	}

}
