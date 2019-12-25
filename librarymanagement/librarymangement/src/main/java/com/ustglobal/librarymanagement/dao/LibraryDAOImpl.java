package com.ustglobal.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;
import com.ustglobal.librarymanagement.dto.Registration;

@Repository
public class LibraryDAOImpl implements LibraryDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean userSave(Registration registration) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(registration);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Registration login(String name, String pwd) {
		System.out.println("name in dao::"+name);
		System.out.println("pass in dao::"+pwd);
		
		EntityManager manager = factory.createEntityManager();
		String selectQry = "from Registration where name=: name and pwd =: pwd";
		
		Query query = manager.createQuery(selectQry);
		query.setParameter("name", name);
		query.setParameter("pwd", pwd);
		Registration reg = null;
		
		try {
			
			reg = (Registration) query.getSingleResult();
			System.out.println("my registration::"+reg);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return reg;
	}

	@Override
	public boolean addBook(AddBook bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteBook(int bid) {
		
		
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		AddBook bean = manager.find(AddBook.class, bid);
		
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		}else {
		return false;
		}
	}// end of delete book()

	@Override
	public List<AddBook> getAllBooks() {
		String jpql = "from AddBook";
		EntityManager manager = factory.createEntityManager();

		TypedQuery<AddBook> query =manager.createQuery(jpql, AddBook.class);
		List<AddBook> addBooks = query.getResultList();
		
		
		return addBooks;
	}// end of List<EmployeeBean>()

	@Override
	public boolean updateBook(AddBook bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		AddBook bookBean = manager.find(AddBook.class, bean.getBid());
		bookBean.setBname(bean.getBname());
		bookBean.setAuthour(bean.getAuthour());
		bookBean.setPrice(bean.getPrice());;
		bookBean.setDOE(bean.getDOE());;
		transaction.commit();
		
		return true;
	}

	@Override
	public Boolean deleteStudent(int sno) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Registration bean = manager.find(Registration.class, sno);
		
		if(bean!=null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		}else {
		return false;
		}
	}

	@Override
	public List<Registration> getAlldetails() {
		String jpql = "from Registration ";
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Registration> query =manager.createQuery(jpql, Registration.class);
		List<Registration> registrations = query.getResultList();
		return registrations;
		
		
	
	}// end of List<getAlldetails>()



	@Override
	public boolean approve(BookRequest request) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			BookRequest book = manager.find(BookRequest.class, request.getId());
			book.setStatus("approved");
			transaction.commit();
			
			return true;
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean reject(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookRequest req = manager.find(BookRequest.class, id);
		
		try {
			if(req!=null) 
				manager.remove(req);
				transaction.commit();
				return true;
			
			}
			catch (Exception e) {
			e.printStackTrace();
			return false;
			}
		
	}
	

	
	


}
