package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TeastPen {
	
	public static void main(String[] args) {
		LinkedList<Pen> l = new LinkedList<Pen>();
		Pen p1 = new Pen(29.5, "cello");
		Pen p2 =new Pen(15.5, "nataraj");
		Pen p3 = new Pen(20.6, "aviva");
		Pen p4 = new Pen(5.9, "bright");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		System.out.println("before sorting ------->");
		displayPenDetails(l);
		Collections.sort(l);
		System.out.println("after sorting======>");
		displayPenDetails(l);
		
		
	}
	static void displayPenDetails(LinkedList<Pen> l) {
		Iterator<Pen> it = l.iterator();
		while (it.hasNext()) {
			Pen lp = it.next();
			System.out.println("Brand is "+lp.brand);
			System.out.println("Price is "+lp.price);
			System.out.println("===========>");
			
			
		}
	}

}
