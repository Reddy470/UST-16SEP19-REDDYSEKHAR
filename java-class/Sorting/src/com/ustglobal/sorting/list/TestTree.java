package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTree {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(56);
		ts.add(67);
		ts.add(9);
		ts.add(45);
		ts.add(70);
		
		//ts.add("deepika");  ClassCastException
		// ts.add(null);    NullPointerException
		
		
		System.out.println("********* using for each *****");
		for (Object s : ts) {
			System.out.println(s);
		}
		System.out.println("********using iterator******");

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			Object  p = it.next();
			System.out.println(p);
		}
	}
		

	}

