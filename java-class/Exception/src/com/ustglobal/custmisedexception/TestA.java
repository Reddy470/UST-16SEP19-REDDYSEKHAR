package com.ustglobal.custmisedexception;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main starts");
		Validator v = new Validator();
		try {
			v.verify(12);
		}catch(Exception e) {
			System.out.println(" exception raises");

		}

		System.out.println("main ended");
	}
}
