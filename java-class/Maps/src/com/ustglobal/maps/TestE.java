package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String , Integer> lh = new TreeMap<String, Integer>();
		lh.put("hariyana", 134204);
		lh.put("madanapalli",517325);
		lh.put("banglore", 560068);

		
		//lh.put(null, 787878778);   NullPointerException
		
		System.out.println(lh);
		
		for (Map.Entry<String ,Integer > m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value );
			System.out.println("===========");
		}
		
	}

}
