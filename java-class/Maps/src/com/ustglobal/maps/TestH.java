package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("ajay", 500);
		ht.put("vijay", 10);
		ht.put("jay", 50);
		ht.put("reddy", 9900);
		ht.put("sekhar",100);
		//ht.put(null, 65);	NullPointerException
		//ht.put("rxjx",null);    NullPointerException
		
		
		System.out.println(ht);

	}

}
