package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class TestEmp {
public static void main(String[] args) {
	HashSet<Employee> hs = new HashSet<Employee>();
	Employee e1 = new Employee(12, "sweety", 45000);   
	Employee e2 = new Employee(70, "reddy", 35000);
	Employee e3 = new Employee(5, "teju", 5000);
	Employee e4 = new Employee(3, "yoga", 28000);
	Employee e5 = new Employee(3, "yoga", 28000);     //hashset allows duplicate 
													//if you not overriden hascode and equal method

	
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);
	
	System.out.println("********using iterator******");

	Iterator<Employee> it = hs.iterator();
	while (it.hasNext()) {
		Employee e = it.next();
		System.out.println("Id Is "+e.id);
		System.out.println("Name Is "+e.name);
		System.out.println("Salary Is "+e.salary);
		System.out.println("===============================");

		
	}
	

	
	
}
}
