package com.ustgloba.l.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(23);
		a1.add(45);
		a1.add(55);
		a1.add(65);
		a1.add(93);
		a1.add(78);
		a1.add(76);
		List<Integer> i1 = a1.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		for (Integer i : i1) {
			System.out.println(i);
		}

	}
}
