package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(470, "reddy", 68.5);
		Student s2 = new Student(471, "sekhar", 78.5);
		Student s3 = new Student(472, "teja", 60.5);
		Student s4 = new Student(493, "sushmi", 74.5);
		Student s5 = new Student(457, "navvu", 80.5);
		Student s6 = new Student(475, "venkat", 78.5);
		Student s7 = new Student(476, "yashu", 90.5);
		Student s8 = new Student(477, "mamatha", 76.5);
		Student s9 = new Student(478, "manu", 77.05);
		
		ArrayList<Student> a1 =new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
		a2.add(s4);
		a2.add(s5);
		a2.add(s6);
		
		ArrayList<Student> a3 = new ArrayList<Student>();
		
		a3.add(s7);
		a3.add(s8);
		a3.add(s9);
	
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("First", a1);
		hm.put("Second", a2);
		hm.put("Third", a3);
	
		
		
		
		ArrayList<Student> first = hm.get("Second");
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			System.out.println("---------------------->");
			
		}


	}

}
