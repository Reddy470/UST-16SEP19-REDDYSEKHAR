package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		ArrayList<Marker> a1 =new ArrayList<Marker>();
		Marker p1 = new Marker("red",20);
		Marker p2 =new Marker( "black",70);
		Marker p3 = new Marker( "blue",60);
		Marker p4 = new Marker( "red",80);
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		System.out.println("before sorting");
		display(a1);
		
		SortByColor sp = new SortByColor();
		Collections.sort(a1, sp);
		System.out.println("after sorting");
		display(a1);
		

	}

	private static void display(ArrayList<Marker> a1) {
		Iterator<Marker> it = a1.iterator();
		while (it.hasNext()) {
			Marker lp = it.next();
			System.out.println("color is "+lp.color);
			System.out.println("Price is "+lp.price);
			System.out.println("===========>");


		}
	}

}


