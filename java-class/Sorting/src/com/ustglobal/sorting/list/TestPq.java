package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPq {
	public static void main(String[] args) {
		PriorityQueue <Integer>pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
		//pq.add("hello");  ClassCastException
		//	pq.add(null);   NullPointerException
		
		pq.add(35);
		pq.add(35);
		pq.offer(1);
		
		System.out.println("Before poll"+pq);
				
		System.out.println("********using iterator******");

		Iterator<Integer> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(pq.poll());
			

		}
		System.out.println(" After poll "+pq);
	}



	}


