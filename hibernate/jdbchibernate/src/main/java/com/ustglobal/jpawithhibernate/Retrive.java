package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Hotel;

public class Retrive {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		 entityManager=entityManagerFactory.createEntityManager();
		 Hotel data=entityManager.find(Hotel.class,1);
		 System.out.println("ID---"+data.getItem_Code());
			System.out.println("Name---"+data.getFoodname());
			System.out.println("Rating---"+data.getPrice());

		
			
		
	}

}
