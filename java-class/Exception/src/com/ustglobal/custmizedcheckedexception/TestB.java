package com.ustglobal.custmizedcheckedexception;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);Scanner sc2 = new Scanner(System.in)){
			System.out.println("enter age");
			int age  = sc .nextInt();
			System.out.println("age is"+age);
			System.out.println(age/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("finally excuted");
		}
		System.out.println("--------------------");
	}
}
