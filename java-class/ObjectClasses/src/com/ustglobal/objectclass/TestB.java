package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p= new Pen();
		int pHasCode = p.hashCode();
		System.out.println(" HasCode of p" +pHasCode);

		Pen q= new Pen();
		int qHasCode = q.hashCode();
		System.out.println(" HasCode of q" +qHasCode);
	}
}
