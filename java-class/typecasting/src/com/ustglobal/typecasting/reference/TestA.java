package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();  //UPCASTING
		System.out.println(p.cost);
		p.write();
		//System.out.println(p.size); not possible
		//p.color();
		Marker m =(Marker)p;  //DOWNCASTING
		System.out.println(m.size);
		m.color();
		m.write();

	}
}
