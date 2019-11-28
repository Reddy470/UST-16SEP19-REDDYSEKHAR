package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestTeacher {
	public static void main(String[] args) {
		ArrayList<Teacher> a1 = new ArrayList<Teacher>();
		Teacher s1 = new Teacher(101,"sekhar",2000);
		Teacher s2 = new Teacher(103,"bhanu",5500);
		Teacher s3 = new Teacher(104,"ravindar",6540);

		a1.add(s1);
		a1.add(s2);
		a1.add(s3);


		for (int i = 0 ;i<a1.size();i++ ) {
			Teacher s = a1.get(i);
			System.out.println(" id " +s.id);
			System.out.println(" name " +s.name);
			System.out.println(" salary " +s.salary);
		}
		System.out.println("======for each=====");
		for (Teacher s : a1) {
			
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



