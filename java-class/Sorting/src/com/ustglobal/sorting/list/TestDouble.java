package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestDouble {
	public static void main(String[] args) {
		LinkedHashSet<Double> d = new LinkedHashSet<Double>();
		d.add(2.4);
		d.add(32.3);
		d.add(44.4);
		d.add(98.0);

		System.out.println("********* using for each *****");
		for (Double  d1 : d) {
			System.out.println(d);
		}
		System.out.println("********using iterator******");

		Iterator<Double> it = d.iterator();
		while (it.hasNext()) {
			Object  p = it.next();
			System.out.println(p);
		}
	}




}

