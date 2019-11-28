package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.AuthorClassConfig;
import com.ustglobal.springcore.di.Book;

public class AuthorAnnotation {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AuthorClassConfig.class);
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuthor().getName());
		System.out.println(book.getAuthor().getPenName());
		
		Book book1 = context.getBean(Book.class);
		System.out.println(book);
		System.out.println(book1);

		context.close();
		
	}
	
	
}
