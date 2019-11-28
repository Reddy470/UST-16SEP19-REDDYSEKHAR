package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a1 =  new ArrayList();
		a1.add(23);
		a1.add(98.7);
		a1.add(true);
		a1.add("good evening");
		
		Iterator it = a1.iterator();
		Object o1 = it.next();
		System.out.println(" obj1 " +o1);
		
		Object o2 = it.next();
		System.out.println("  obj2 " +o2);
		
		Object o3 = it.next();
		System.out.println(" obj3 " +o3);
		
		Object o4 = it.next();
		System.out.println(" obj4 " +o4);
		
		boolean b = it.hasNext();
		System.out.println("hasnext false"+b);
		
		//Object o5 = it.next();
		//System.out.println(" obj5 " +o5);
		
		
	
		
		System.out.println("------+++++++ using for loop ++=====--------");
		
		for (int i = 0;i<a1.size();i++) {
			Object o = a1.get(i);
			System.out.println(o);
		}
		ArrayList al1 =  new ArrayList();
		al1.add(23);
		al1.add(98.7);
		al1.add(false);
		al1.add("momo");
		
		System.out.println("-----using iterator------");
		
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o21 = it1.next();
			System.out.println(o21);
		}
	}
}
