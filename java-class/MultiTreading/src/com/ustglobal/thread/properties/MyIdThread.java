package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread"+mi.getId());
		
		System.out.println("priority "+Thread.currentThread().getId());
		/*
		 * Thread.currentThread().setPriority(16);
		 * IllegalArgumentException
		 */
		
				
		/*
		 * mi.setId();
		 * we cant set id method
		 */		
		
		System.out.println("main ended");
	}

}
