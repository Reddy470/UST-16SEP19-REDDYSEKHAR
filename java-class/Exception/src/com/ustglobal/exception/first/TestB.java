package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("main started");
		int a =10;
		int b = 0;
		try {
			b=a/0;
			System.out.println(b);
			System.out.println("hello");		// exception is raises then need not to excuate
			System.out.println("happy diwalli");
		} catch(ArithmeticException ae) {
			System.out.println(" number not diviedeby zero");

		}
		
		System.out.println("main ended");
	}
}
