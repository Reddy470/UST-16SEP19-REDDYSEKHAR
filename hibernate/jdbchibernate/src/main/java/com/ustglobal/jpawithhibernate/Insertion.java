package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Hotel;

public class Insertion {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Hotel hotel=new Hotel();
		hotel.setId(2);
		hotel.setFoodname("Fish");
		hotel.setPrice(200);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		 entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();
		 transaction.begin();
			entityManager.persist(hotel);
			System.out.println("Record saved");
			transaction.commit();
			entityManager.close();
	}
	

}
