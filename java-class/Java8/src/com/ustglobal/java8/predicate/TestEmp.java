package com.ustglobal.java8.predicate;

import java.util.function.Predicate;

public class TestEmp {
	public static void main(String[] args) {
		
		Predicate<Employee> p = e->{
			if(e.id>=105) {
				return true;
			}else {
				return false;
			}
		};
		Employee e = new Employee(97, "anu", 78000);
		System.out.println(p.test(e));
	}

}
