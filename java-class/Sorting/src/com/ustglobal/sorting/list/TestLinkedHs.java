package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHs {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhavaya");

		System.out.println("********* using for each *****");
		for (Object s : ls) {
			System.out.println(s);
		}
		System.out.println("********using iterator******");

		Iterator it = ls.iterator();
		while (it.hasNext()) {
			Object  p = it.next();
			System.out.println(p);
		}
	}

}

