package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.StudentDAO;
import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO dao;

	@Override
	public AddBook searchBookByName(String bname) {
		// TODO Auto-generated method stub
		return dao.searchBookByName(bname);
	}

	@Override
	public boolean requestBook(BookRequest book) {
		// TODO Auto-generated method stub
		return dao.requestBook(book);
	}

	@Override
	public List<BookRequest> reqList() {
		// TODO Auto-generated method stub
		return dao.reqList();
	}

	

	
}
