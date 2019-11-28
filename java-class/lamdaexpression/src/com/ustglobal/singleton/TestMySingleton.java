package com.ustglobal.singleton;

public class TestMySingleton {
	
	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnectoin();
		ms.s = "hello";
		System.out.println("HasHcode of ms" + ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnectoin();
		mx.s = "hii";
		System.out.println("hashcode of mx" + mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}

}
