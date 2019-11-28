package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 9809989);
		hm.put("mala", 6300598);
		hm.put("sheela", 7656767);
		hm.put(null, 4567899);
		hm.put(null,98765404);
		
		System.out.println("Data "+hm);
		
		hm.put("mala", 345666788);
		System.out.println("After Modify"+hm);    //keys does not allow duplicate values
		
		hm.put("dimple", 345666788);
		
		System.out.println(" after modify "+hm);  // Values are allowed duplicates
		
		System.out.println(" after null "+hm);
		
		System.out.println("++====================++");
		System.out.println("After adding dupicate null");
		System.out.println(hm);
		System.out.println("=====================================");
		
		Object Phoneno = hm.get("sheela");
		System.out.println("value is "+Phoneno);
		
		System.out.println("================");
		
	   Object Phoneno1 = hm.get("reddy");
	   System.out.println("value is "+Phoneno1);
	   
	   System.out.println("===========================");
	   
	  Object value =  hm.remove("kuku");
	  System.out.println("value is "+value);
	  
	  System.out.println(" After remove---->"+hm);
	}

}
