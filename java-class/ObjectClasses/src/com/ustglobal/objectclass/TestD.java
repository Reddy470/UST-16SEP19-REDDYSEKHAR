package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s = new Student(10,"ranga",45.77);
		System.out.println(s);
		int sHashcode = s.hashCode();
		System.out.println("hashcode value ::"+sHashcode);
		String s1 = s.toString();
		System.out.println(s1);
		
	}

}
