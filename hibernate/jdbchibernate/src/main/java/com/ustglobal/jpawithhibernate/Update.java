package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Hotel;

public class Update {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		 entityManager=entityManagerFactory.createEntityManager();
		 transaction=entityManager.getTransaction();
		transaction.begin();
		Hotel data=entityManager.find(Hotel.class,1);
		data.setFoodname("Chicken ");
		System.out.println("Record updated");
		transaction.commit();
	}

}
