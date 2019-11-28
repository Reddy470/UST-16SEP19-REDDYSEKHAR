package com.ustglobal.typecasting.primtive;

public class TestA {
public static void main(String[] args) {
	byte b = 10;
	int a = b;  //implicit casting
	System.out.println("a is "+a);
	int p = 20 ;
	double q = p ;
	System.out.println("q is "+q);
	
	System.out.println("************");
	
	double x = 20.67;
	int y = (int ) x;
	System.out.println("y is "+y);
	byte z = (byte) x;
	System.out.println("z is "+z);
	char r = (char) x;
	System.out.println(" r is "+r);
}

}
