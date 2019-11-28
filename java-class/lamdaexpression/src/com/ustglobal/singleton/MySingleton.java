package com.ustglobal.singleton;

public class MySingleton {
	
	private static MySingleton instance = null;
	public String s;
	
	private MySingleton() {

	}
	
	public static MySingleton getDbConnectoin() {
		
		if (instance == null) {
			instance = new MySingleton();
			return instance;
		}else {
			return instance;
		}
	}

}
