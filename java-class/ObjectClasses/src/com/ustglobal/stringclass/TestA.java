package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		//String constant pool
		String s1 = "aishu";
		String s2 = "deepika";
		
		//Heap Memory
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
											// string equals method
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		
											//string toLowercase
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
											// STRING toUppercase
		String s7 = s1.toUpperCase();
		System.out.println(s7);
											// charAt method
		char c =s1.charAt(0);
		System.out.println(c);
											// equalsIgnoreCase method
		boolean  b= s1.equalsIgnoreCase("AISHu");
		System.out.println(b);
												//stringBuffer
		
		System.out.println("---------stringBuffer-------");
		StringBuffer sb1 = new StringBuffer();
		sb1.append("xyz");
		System.out.println(sb1);
		System.out.println(sb1.length());
	}

}
