package com.ustglobal.librarymanagement.service;

import java.util.List;

import com.ustglobal.librarymanagement.dto.AddBook;
import com.ustglobal.librarymanagement.dto.BookRequest;

public interface StudentService {
	
	public AddBook searchBookByName(String bname);
	
	/*
	 * public int requestBook(int sno, int bid); public
	 * List<AddBook>getAllRequestedBook(int sno); public int returnBook(int sno, int
	 * bid);
	 */
	public boolean requestBook(BookRequest book);

	public List<BookRequest> reqList();

}
