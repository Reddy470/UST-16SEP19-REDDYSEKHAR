package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(101,"ankitha",45.4);
		Student s2 = new Student(103,"salaman",55.03);
		Student s3 = new Student(104,"ankitha",65.40);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		
		for (int i = 0 ;i<a1.size();i++ ) {
			Student s = a1.get(i);
			System.out.println(" id " +s.id);
			System.out.println(" name " +s.name);
			System.out.println(" percentage " +s.percentage);
		}
		System.out.println("======for each=====");
		for (Student s : a1) {
			System.out.println(s);
		}
	}
}
