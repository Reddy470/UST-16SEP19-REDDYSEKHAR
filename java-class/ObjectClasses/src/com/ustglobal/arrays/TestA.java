package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 40;
		nums[3] = 50;
		nums[4] = 60;
		
		for (int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		//System.out.println("-------second type of array------");
		
		int [] nums1 = {70,20,30,49,47};
		System.out.println("------foreach method starts----------");
		
		for(int i : nums1) {
			System.out.println(i);
		}
		System.out.println("=================");
		byte [] b = {1,2,3,4,5,6};
		for(int n: b ) {
			System.out.println(b);
		}
		for(int i= 0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("--------------------+++-------");
		
		double [] d = {20.3,33.3,40.3,50.4,70,7};
		for(double i: d) {
			System.out.println(d);
		}
		for(double n = 0; n<d.length;n++) {
			System.out.println(d[(int) n]);
		}
	}

}
