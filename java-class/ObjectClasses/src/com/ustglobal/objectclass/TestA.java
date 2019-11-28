package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		UsbPort.connect(m);
		
		PenDrive p = new PenDrive();
		UsbPort.connect(p);
		
		
		
		

	}

}
