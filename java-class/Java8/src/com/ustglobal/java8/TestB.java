package com.ustglobal.java8;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = s->{
			if(s.percentage>=35) {
				return true;
			}else {
				return false;
			}
		};
		Student s = new Student(12, "reddy", 70.8);
		boolean res = p.test(s);
		System.out.println(res);
		
		
	}
}
