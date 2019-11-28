package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinked {
	public static void main(String[] args) {
		LinkedList<Employee> a1 = new LinkedList<Employee>();
		Employee s1 = new Employee(101,"sekhar",2000);
		Employee s2 = new Employee(103,"bhanu",5500);
		Employee s3 = new Employee(104,"ravindar",6540);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);


		for (int i = 0 ;i<a1.size();i++ ) {
			Employee s = a1.get(i);
			System.out.println(" id " +s.id);
			System.out.println(" name " +s.name);
			System.out.println(" salary " +s.salary);
		}
		System.out.println("======for each=====");
		for (Employee s : a1) {

			System.out.println(s);
		}
		System.out.println("======using iterator========");

		Iterator it1 = a1.iterator();
		while(it1.hasNext()) {
			Object o21 = it1.next();
			System.out.println(o21);
		}	
		System.out.println("=========list itrerator======");
		ListIterator it = a1.listIterator();

		while (it.hasPrevious()) {
			Object o = it.previous();
			System.out.println(o);
		}




	}

}
