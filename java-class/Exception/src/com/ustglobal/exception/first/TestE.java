package com.ustglobal.exception.first;

public class TestE {
	public static void main(String[] args) {
		System.out.println("main started");
		String s = "hello";
		int [] a = {10,20,30};
		int b = 10;

		try {

			String  s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);

		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("exception occured");
		}
	// catch(NullPointerException npe) {
	//		System.out.println("dont play with null");
	//	}catch(ArrayIndexOutOfBoundsException aie) {
	//		System.out.println("index is not present");
			
	//	}catch(ArithmeticException ae) {
	//		System.out.println("divided by zero");
			
	//	}
		System.out.println("main ended");
	}
}
