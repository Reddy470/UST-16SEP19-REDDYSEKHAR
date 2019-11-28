package com.ustgloba.l.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(9);
		a1.add(7);
		a1.add(10);
		a1.add(5);
		a1.add(6);
		List<Integer> i1 = a1.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it =i1.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Sorted ----->");
			System.out.println(i);
		}


	}
}
