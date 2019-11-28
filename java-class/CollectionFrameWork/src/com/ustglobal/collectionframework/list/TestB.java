package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList a1 =  new ArrayList();
		a1.add(12);
		a1.add(22.5);
		a1.add(true);
		a1.add("chinnu");
		
		for (Object o: a1) {
			System.out.println(o);
		}
	}
}
