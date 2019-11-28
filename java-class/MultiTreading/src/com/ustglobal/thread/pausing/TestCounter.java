package com.ustglobal.thread.pausing;

public class TestCounter {
	public static void main(String[] args) {
		System.out.println("Main started");
		Counter c = new Counter();
		
		Runnable r1=()->{
			c.increment();
			c.showValue();
		};
		Runnable r2=()->{
		
			c.decrement();
			c.showValue();
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		
		System.out.println("main ended");

		
	}

}
