package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen>  {
	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
//	@Override
//	public int compareTo(Pen p) {
//		Double d = this.price;
//		Double d1 = p.price;
//		return d.compareTo(d1);
//		}
	@Override
	public int compareTo(Pen p) {
		String s = this.brand.toLowerCase();
		String s1 = p.brand.toLowerCase();
		return s.compareTo(s1);
	}

}
