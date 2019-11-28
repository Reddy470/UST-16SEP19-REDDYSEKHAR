package com.ustgloba.l.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmp {
	public static void main(String[] args) {
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		Employee e1 = new Employee(76, "sam");
		Employee e2 = new Employee(18, "virat");
		Employee e3 = new Employee(07, "Dhoni");
		
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		Comparator<Employee> cmp = (s1,s2)->{
			return s1.name.compareTo(s2.name);
			
		};
		
		List<Employee>  l =a1.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it =l.iterator();
		while (it.hasNext()) {
			Employee i = it.next();
			System.out.println("id is "+i.id);
			System.out.println("name is "+i.name);
			System.out.println("Sorted ----->");
		}



	}

}
