package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class TestA {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s1 = new Student(101,"Reddy",85.4);
		Student s2 = new Student(102,"Sushmi",95.03);
		Student s3 = new Student(104,"navvu",75.40);
		Student s4 = new Student(103,"Sekhar",70.40);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		System.out.println("Before sorting ---->");
		displayStudentDetails(a1);
		
		Collections.sort(a1);
		System.out.println("After sorting------>");
		displayStudentDetails(a1);



	}
	
  static void displayStudentDetails(ArrayList<Student> a1) {
		Iterator<Student> it = a1.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("----------------------------");
			
			
			
			
			
			
		}
	}
}
