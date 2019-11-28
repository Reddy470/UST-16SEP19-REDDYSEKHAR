package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 9809989);
		hm.put("mala", 6300598);
		hm.put("sheela", 7656767);
		
		HashMap hm1 = new HashMap ();
		hm1.put("reddy", 63000566);
		hm1 .put("sekhar", 91000169);
		hm1.put("sushmi", 89780042);
		hm1.put("navvu", 87978780);
		
	boolean hashKey  = 	hm.containsKey("mala");
	System.out.println("hash key is"  + hashKey);
	 boolean hasvalue  = hm.containsValue(9809989);
	 System.out.println("has value is "+hasvalue);
	 
	 hm.putAll(hm1);  // one hashmap to another hashmap merge
	 
	 System.out.println("====================================");
	 
	 System.out.println(" After put all-->" +hm);
	 
	 System.out.println( hm.size());
	 
	 boolean isEmpty = hm.isEmpty();
	 System.out.println(" Map is Empty "+isEmpty );
	 
	 hm.clear();
	 System.out.println("After Clear "+hm);
	
		
	}
}
