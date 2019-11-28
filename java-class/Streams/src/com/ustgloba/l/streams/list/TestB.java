package com.ustgloba.l.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(9);
		a1.add(7);
		a1.add(10);
		List<Integer> i1 = a1.stream().map(i->i*2).collect(Collectors.toList());
		
		for (Integer i : i1) {
			System.out.println(i);
		}

	}
		
	}


