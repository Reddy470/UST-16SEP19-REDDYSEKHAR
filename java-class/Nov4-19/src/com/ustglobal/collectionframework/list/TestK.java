package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		ArrayList<Double> a1 = new ArrayList<Double>();
		a1.add(34.5);
		a1.add(20.3);
		a1.add(80.3);
		a1.add(12.3);
		a1.add(34.3);						// all wrapper class are final and immutable
		a1.add(null);
		a1.add(null);
		
		System.out.println(a1);
		
		a1.add(2, 54.6);
		System.out.println("after Add in 2nd index"+a1);
		
		a1.remove(0);
		System.out.println("After remove in 0th index"+a1);
		
		a1.remove(null);
		System.out.println("after removeing null"+a1);
		
		Double val = a1.get(4);
		System.out.println("object  At  4th index"+val);
		
		
		a1.set(2, 77.6);
		System.out.println("After replacing 2nd index"+a1);
		
		
		a1.clear();
		System.out.println("After clear method "+a1);
		
		a1.contains(54.6);

		List<Double> a1l = new ArrayList<>();
		a1l.add(12.3);
		a1l.add(22.3);
		a1l.add(34.3);
		
		a1.addAll(a1l);
		System.out.println("After add all"+a1);
		
		boolean contain = a1.containsAll(a1l);
		System.out.println("Contains all of a1I "+contain);
		
		boolean res = a1.removeAll(a1l);
		System.out.println("removed of all of "+res);
		

		
	}

}
