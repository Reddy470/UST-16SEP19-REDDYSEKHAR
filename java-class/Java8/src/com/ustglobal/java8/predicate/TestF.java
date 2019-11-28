package com.ustglobal.java8.predicate;

import java.util.function.Consumer;

public class TestF {
	public static void main(String[] args) {
		Consumer<Student> c = s->{
			System.out.println("Id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("perentage is"+s.percentage);
			System.out.println("=============================");
		};
		Student s1 =new Student(25, "anu", 67.89);
		c.accept(s1);
	}

}
