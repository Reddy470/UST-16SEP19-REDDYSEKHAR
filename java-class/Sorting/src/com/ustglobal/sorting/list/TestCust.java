package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCust {
	public static void main(String[] args) {
		
		SortByCustName sn = new SortByCustName();
		TreeSet<Custmer> ts = new TreeSet<Custmer>(sn);
		Custmer c1 = new Custmer("reddy", 470, 450000);
		Custmer c2 = new Custmer("sekhar", 476, 44500.00);
		Custmer c3 = new Custmer("sushmi", 493, 55000);
		Custmer c4 = new Custmer("navvu", 457, 30000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);

		System.out.println("********using iterator******");

		Iterator<Custmer> it = ts.iterator();
		while (it.hasNext()) {
			Custmer b = it.next();
			System.out.println(" Name is  "+b.name);
			System.out.println(" Id  Is "+b.id);
			System.out.println(" salary Is "+b.salary);
			System.out.println("===============================");

		}
	}







}

