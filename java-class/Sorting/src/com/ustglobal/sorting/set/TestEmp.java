package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.ustglobal.sorting.list.Employee;

public class TestEmp {
	
	public static void main(String[] args) {
		Comparator<com.ustglobal.sorting.set.Employee> comp = (s1,s2)-> {
			Double d1 = s1.height;
			Double d2 = s2.height;
			
			return d1.compareTo(d2);
		};
		
		TreeSet<com.ustglobal.sorting.set.Employee> ts = new TreeSet<com.ustglobal.sorting.set.Employee>(comp);
		com.ustglobal.sorting.set.Employee e1 = new com.ustglobal.sorting.set.Employee(12, "sweety", 4.6); 
		com.ustglobal.sorting.set.Employee e2 = new com.ustglobal.sorting.set.Employee(70, "reddy", 5.9);   
		com.ustglobal.sorting.set.Employee e3 = new com.ustglobal.sorting.set.Employee(5, "teju", 5.6);   
		com.ustglobal.sorting.set.Employee e4 = new com.ustglobal.sorting.set.Employee(3, "yoga", 4.5);   

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("********using iterator******");

		Iterator<com.ustglobal.sorting.set.Employee> it = ts.iterator();
		while (it.hasNext()) {
			com.ustglobal.sorting.set.Employee e = it.next();
			System.out.println("Id Is "+e.id);
			System.out.println("Name Is "+e.name);
			System.out.println("height Is "+e.height);
			System.out.println("===============================");
		}
			
	}

}
