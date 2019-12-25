package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.LibraryDAO;
import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;
import com.ustglobal.librarymanagement.dto.Registration;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	@Autowired
	private LibraryDAO dao;

	@Override
	public boolean userSave(Registration reg) {
		
		/*
		 * // if(reg.getName()==null||reg.getPwd()==null) { // return false; // } else
		 * if(reg.getPwd().length()<8) { // return false; // }
		 */
		
		return dao.userSave(reg);
	}

	@Override
	public Registration loginUser(String name, String pwd) {
		
		return dao.login(name, pwd);
	}

	@Override
	public boolean addBook(AddBook bean) {
		if(bean.getBname()==null||bean.getPrice()==null) {
			return false;
		} else if(bean.getAuthour().length()<8) {
			return false;
		}

		return dao.addBook(bean);
	}

	@Override
	public boolean deleteBook(int bid) {
		// TODO Auto-generated method stub
		return dao.deleteBook(bid);
	}

	@Override
	public List<AddBook> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public boolean updateBook(AddBook bean) {
		// TODO Auto-generated method stub
		return dao.updateBook(bean);
	}

	@Override
	public Boolean deleteStudent(int sno) {
		// TODO Auto-generated method stub
		return dao.deleteStudent(sno);
	}

	@Override
	public List<Registration> getAlldetails() {
		// TODO Auto-generated method stub
		return dao.getAlldetails();
	}

	@Override
	public boolean approve(BookRequest request) {
		// TODO Auto-generated method stub
		return dao.approve(request);
	}

	@Override
	public boolean reject(int id) {
		// TODO Auto-generated method stub
		return dao.reject(id);
	}


	
	
	

	/*
	 * @Override public boolean bookRequest(int sno, List<AddBook> books) { // TODO
	 * Auto-generated method stub return dao.bookRequest(sno, books); }
	 */

}
