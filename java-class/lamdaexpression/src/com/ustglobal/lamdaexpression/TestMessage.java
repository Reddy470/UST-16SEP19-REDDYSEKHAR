package com.ustglobal.lamdaexpression;

public class TestMessage {
	public static void main(String[] args) {
		AddMessage am =	( message) -> {
			System.out.println("hello");
			System.out.println(message);
			return message;
		};
		String msg1 = am.greet("haii");
	}

}
