package com.ustglobal.java8;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student(12, "reddy", 98.9));
		a1.add(new Student(18, "virat", 18.9));
		a1.add(new Student(07, "dhoni", 88.9));
		a1.add(new Student(76, "priyank", 38.9));
		a1.add(new Student(2, "sekhar", 48.9));
		
		Helper h1 = new Helper();
		// h1.displayAllStudent(a1);
		//h1.displayFailedStudents(a1);
		h1.displayTopperStudents(a1);



	}
}
