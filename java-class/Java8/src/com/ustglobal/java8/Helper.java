package com.ustglobal.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Helper {
	void displayAllStudent(ArrayList<Student>a1) {
		Iterator<Student> it = a1.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is"+s.percentage);
			System.out.println("=====================================");
		}
	
	}
	void displayFailedStudents(ArrayList<Student> a1) {
		List<Student> l = a1.stream().filter(student->student.percentage<40).collect(Collectors.toList());
		
		Iterator<Student> it =l.iterator();
		while (it.hasNext()) {
			Student i = it.next();
			System.out.println("id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("percentage is "+i.percentage);

			System.out.println("Sorted ----->");
		}

	}
	Comparator<Student> a2 = (s4,s6)->{
		Double d1 = s4.percentage;
		Double d2 = s6.percentage;
		return d1.compareTo(d2);
	};
	void displayTopperStudents(ArrayList<Student> a1) {
		Student l2 = a1.stream().min(a2).get();
		System.out.println("id is "+l2.id);
		System.out.println("name is "+l2.name);
		System.out.println("perentage is "+l2.percentage);
		
	}
}
