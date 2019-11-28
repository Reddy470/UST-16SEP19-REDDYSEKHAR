package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
public static void main(String[] args) {
	System.out.println(" Scanner class");
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter age ");
	int age = sc .nextInt();
	System.out.println(" Age is "+age);
	
	System.out.println(" holiday ");
	boolean a = sc.nextBoolean();
	System.out.println(a);
	
	System.out.println(" enter name");
	String name = sc.next();
	System.out.println(" name is "+name);
	
	
	System.out.println(" my village ");
	String name1 = sc.nextLine();
	System.out.println("name1 is "+name1);
}
}
