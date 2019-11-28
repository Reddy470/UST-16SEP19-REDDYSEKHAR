package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("main started");
		int [] a= {10,20,30};
		int b =10;
		try {
			System.out.println(a[4]);
			System.out.println(b/2);
		}catch(ArithmeticException ae) {
			System.out.println("number dived by zero");
			
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(" array is not present");
			
		}
		System.out.println("main ended");

	}
}
