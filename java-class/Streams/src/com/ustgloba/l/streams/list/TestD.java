package com.ustgloba.l.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(25);
		marks.add(33);
		marks.add(49);
		marks.add(57);
		marks.add(6);
		marks.add(99);
		marks.add(73);
		marks.add(10);
		
		Comparator<Integer> cmp = (m1,m2)->{
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		
		long noOFFailedStudents = marks.stream().filter(i->i<40).count();
		System.out.println(noOFFailedStudents);
		
		System.out.println("===================");
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println("min value is "+i);
		System.out.println("============");
		Integer i1 = marks.stream().max(cmp).get();
		System.out.println("max value is "+i1);

		
		
	}

}
