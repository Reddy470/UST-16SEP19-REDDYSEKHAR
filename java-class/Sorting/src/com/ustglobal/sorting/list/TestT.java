package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestT {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("mmuni");
		ts.add("kajal");

		System.out.println("********* using for each *****");
		for (Object s : ts) {
			System.out.println(s);
		}
		System.out.println("********using iterator******");

		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			Object  p = it.next();
			System.out.println(p);
		}
	}


}


