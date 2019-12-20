package com.ustglobal.bootwithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.bootwithhibernate.dto.Product;
import com.ustglobal.bootwithhibernate.dto.ProductOrder;

@Repository
public class ProductDaoImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product p = manager.find(Product.class, product.getProduct_id());
			p.setName(product.getName());
			p.setCatogory(product.getCatogory());
			p.setQuantity(product.getQuantity());
			p.setCompany(product.getCompany());
			p.setPrice(product.getPrice());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	

	@Override
	public Product searchProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where catogory=:catogory";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("catogory", catagory);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		return typedQuery.getResultList();
	}

	@Override
	public Product searchProductByCompany(String company) {
		
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where company=:company";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("company", company);
			Product product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean addProduct(ProductOrder productOrder) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(productOrder);
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	

}
