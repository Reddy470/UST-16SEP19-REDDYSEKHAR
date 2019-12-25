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


@Repository

public class StudentDAOImpl  implements StudentDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;


	@Override
	public AddBook searchBookByName(String bname) {
		String jpql = "from AddBook where bname=:bname";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<AddBook> query = manager.createQuery(jpql, AddBook.class);
		query.setParameter("bname", bname);
		try {
			AddBook bean = (AddBook) query.getSingleResult();
			return bean;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			manager.close();
		}
	}// end of search book()



	@Override
	public boolean requestBook(BookRequest request) {
		System.out.println("userid::"+request.getUserId());
		System.out.println("book id::"+request.getBookId());
		System.out.println("book name::"+request.getBookName());
		
		BookRequest req = new BookRequest();
		req.setUserId(request.getUserId());
		req.setBookId(request.getBookId());
		req.setBookName(request.getBookName());
		req.setStatus("pending");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(req);
		System.out.println(transaction);
		transaction.commit();
		return true;
		}
		catch (Exception e) {
             e.printStackTrace();
             transaction.rollback();
             return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BookRequest> reqList() {
		String sql =" from BookRequest where status=: status ";
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery(sql);
		query.setParameter("status", "pending");
		List<BookRequest> req = null;
		
		try {
			System.out.println("query::"+query.getResultList());
			req = query.getResultList();
			System.out.println("my registration::"+req);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return req;
		
	}

	

}//end of StudentDAOImpl






