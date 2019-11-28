package com.ustglobal.java8.predicate;

import java.util.function.Function;

public class TestStudent {
	public static void main(String[] args) {
		Function<Integer, Student> f = id ->{
			Student s = new Student(2,"vijay",56.78);
			s.id = id;
			return s;
		};
		Student  s = f.apply(27);
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("percentage is"+s.percentage);
	}

}
