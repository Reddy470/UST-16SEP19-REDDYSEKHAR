package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;
import com.ustglobal.librarymanagement.dto.Registration;

public interface LibraryDAO {

	public boolean userSave(Registration registration);
	public Registration login(String name, String pwd);
	public Boolean deleteStudent(int sno);
	public List<Registration> getAlldetails();
	public boolean addBook(AddBook bean);
	public boolean deleteBook(int bid);
	public List<AddBook> getAllBooks();
	public boolean updateBook(AddBook bean);
	
	public boolean approve(BookRequest request);
	public boolean reject(int id);
	
	//public boolean bookRequest( int sno,List<AddBook> books);
}
