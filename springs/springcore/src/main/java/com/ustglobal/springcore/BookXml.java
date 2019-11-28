package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Book;

public class BookXml {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		Book book = context.getBean(Book.class);
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		
		Book book1 = context.getBean(Book.class);
		System.out.println(book);
		System.out.println(book1);

		System.out.println("***********************");
		System.out.println(book.getAuthor().getName());	
		System.out.println(book.getAuthor().getPenName());
		context.close();
	}

}
