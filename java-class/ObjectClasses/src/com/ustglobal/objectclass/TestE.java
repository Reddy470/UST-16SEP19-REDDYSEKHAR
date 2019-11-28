package com.ustglobal.objectclass;

public class TestE {
	public static void main(String[] args) {
		Cow c = new Cow(1,"ganga",20000);
		Cow c1 = new Cow(2,"manga",40000);
		Cow c2 = new Cow(3,"yamunaha",50000);
		Cow c4 = c2;
		System.out.println(c.equals(c2));
		System.out.println(c2.equals(c4));
	}

}
