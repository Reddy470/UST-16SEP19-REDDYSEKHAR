package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {
	public static void main(String[] args) {
		
		SortByMicr micr = new SortByMicr();
		SortByPinCode sp = new SortByPinCode();
		SortByName sb = new SortByName();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(micr);
		
		Bank  b1 = new Bank("HDFC", 560068, 67878778);
		Bank  b2 = new Bank("SBI", 560071, 93578470);
		Bank  b3 = new Bank("ANDHRA", 560070, 470493457);
		Bank  b4 = new Bank("AXIS", 560093, 476470415);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
       
		
		System.out.println("********using iterator******");

		Iterator<Bank> it = ts.iterator();
		while (it.hasNext()) {
			Bank b = it.next();
			System.out.println(" Name is  "+b.name);
			System.out.println(" Pincode  Is "+b.pincode);
			System.out.println(" MICR Is "+b.micr);
			System.out.println("===============================");

		}
	}
}
