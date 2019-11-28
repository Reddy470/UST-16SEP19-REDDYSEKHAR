package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		System.out.println("                 ");
		int p = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority "+p);
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority "+	Thread.currentThread().getPriority());
		
		System.out.println("*************************");
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println(" MyPriorityThread "+q);
		
		t.setPriority(6);
		System.out.println("my priority thread "+t.getPriority());
		System.out.println("*************************");

		
		System.out.println("main ended");
	}

}
