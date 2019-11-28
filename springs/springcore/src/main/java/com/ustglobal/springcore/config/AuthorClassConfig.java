package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class AuthorClassConfig {
	@Bean(name="book")
	//@Scope("prototype")
	public Book getBook() {
		Book book = new Book();
		book.setName("R.s.Aggarwal");
		book.setPrice(500);
		book.setAuthor(getAuthor());
		return book;
		
	}
	@Bean(name="author")
	public Author getAuthor() {
		
		Author author =new Author();
		author.setName("R.s.Aggarwal");
		author.setPenName("cello");
		return  author;
		
	}

}
