package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("reddy");
	a1.add("sekhar");
	a1.add("sushmi");
	a1.add("navvu");
	
	System.out.println("Before sort ----->"+a1);
	
	Collections.sort(a1);
	System.out.println("After sort------>"+a1);

}
}
