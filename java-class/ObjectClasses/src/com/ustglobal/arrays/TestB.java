package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int [] nums= {10,20,30,40};
		//System.out.println(nums[10]); ArrayIndexOutOFboundsexception
		
		recevie(nums);
		int[] values = getArray();
		for(int val: values) {
			System.out.println(val);
		}
		String[] names = getString();
		for(String nam: names) {
			System.out.println(nam);
		}
	}
	static void recevie(int[]numbers) {
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	static int[] getArray() {
		int [] values = {3,4,4,5,6,7,};
		return values;
	}
	static String[] getString() {
		String [] names = {"reddy","sekhar","sushmi","navvu"};
		return names;
	}
}
