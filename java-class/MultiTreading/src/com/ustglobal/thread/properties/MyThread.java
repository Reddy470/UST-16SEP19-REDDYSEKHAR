package com.ustglobal.thread.properties;

public class MyThread extends Thread{
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("Current ThreadName " +tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("Mythread name " +mname);
		
		
		Thread.currentThread().setName("Bala");
		
		t1.setName("golu");
		System.out.println("my thread name "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main Ended");
	}


}
