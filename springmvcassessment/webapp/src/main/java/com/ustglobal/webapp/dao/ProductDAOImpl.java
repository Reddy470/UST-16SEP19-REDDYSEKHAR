package com.ustglobal.webapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.webapp.beans.Product;
import com.ustglobal.webapp.beans.Retailer;

@Repository
public class ProductDAOImpl  implements ProductDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;


	@Override
	public int createProfile(Retailer bean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();

		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
		
	} // end of createProfile()

	@Override
	public Retailer login(int id, String password) {
		
		String jpql = "from Retailer where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql, Retailer.class);

		query.setParameter("id", id);
		query.setParameter("password", password);

		try {
			Retailer bean = query.getSingleResult();
			return bean;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

		
		
		
	} // end of login

	@Override
	public Product searcheProduct(int id) {
		EntityManager manager = factory.createEntityManager();

		return manager.find(Product.class, id);
	} //end of searcheProduct()
	
	
	

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean = manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();

		return true;
	}  // end of changePassword()

	@Override
	public Product buyOneProduct(int bid) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product bean = manager.find(Product.class, bid);
			int quantity = bean.getQuantity();
			bean.setQuantity(quantity-1);
			transaction.commit();			
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
	}
	
	
	
	

}
