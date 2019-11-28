package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	//	@Override
	//	public int compareTo(Laptop s) {
	//		Integer i = this.ram;
	//		Integer j =s.ram;
	//		return i.compareTo(j);
	//		
	//	}
	//	
	//	@Override
	//	public int compareTo(Laptop s) {
	//		Double d = this.price;
	//		Double b = s.price;
	//		return d.compareTo(b);
	//		
	//	}
	@Override
	public int compareTo(Laptop s) {
		String p = this.name.toLowerCase();
		String q = s.name.toLowerCase();
		return p .compareToIgnoreCase(q);
	}

}
