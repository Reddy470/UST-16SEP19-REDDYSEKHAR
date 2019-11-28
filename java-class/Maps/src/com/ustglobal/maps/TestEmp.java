package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1  = new Employee(470, "reddy", 680000);
		Employee e2  = new Employee(471, "teju", 80000);
		Employee e3  = new Employee(474, "yashu", 30000);
		Employee e4  = new Employee(475, "sunil", 3000);
		Employee e5  = new Employee(476, "sekhar", 45000);
		Employee e6  = new Employee(479, "venkat", 30500);
		Employee e7  = new Employee(457, "navvu", 7600);
		Employee e8  = new Employee(493, "sushmi", 37000);
		Employee e9  = new Employee(415, "asha", 680);
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
		ArrayList<Employee> a2 = new ArrayList<Employee>();
		a2.add(e4);
		a2.add(e5);
		a2.add(e6);
		
		ArrayList<Employee> a3 = new ArrayList<Employee>();
		a3.add(e7);
		a3.add(e8);
		a3.add(e9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("reddy", a1);
		hm.put("sekhar", a2);
		hm.put("sushmi", a3);
		
		ArrayList<Employee> sushmi = hm.get("sushmi");
		Iterator<Employee> it = sushmi.iterator();
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("salary is "+s.salary);
			System.out.println("---------------------->");
			
		}

		
		
		
		



	}
}
