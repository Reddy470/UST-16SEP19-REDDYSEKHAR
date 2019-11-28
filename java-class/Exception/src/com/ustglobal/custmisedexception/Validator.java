package com.ustglobal.custmisedexception;

public class Validator {
void verify(int age) {
	if(age<28) {
		throw new InvalidAgeException(" try again next time");
	}
}
}
