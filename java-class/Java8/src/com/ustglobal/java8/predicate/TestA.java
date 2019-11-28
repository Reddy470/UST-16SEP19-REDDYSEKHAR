package com.ustglobal.java8.predicate;

import java.util.function.Function;

public class TestA {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i  ->i*i;
		Integer i =	f.apply(10);
		System.out.println("result is"+i);
		int res = f.apply(5);
		System.out.println(res);

	}
}
