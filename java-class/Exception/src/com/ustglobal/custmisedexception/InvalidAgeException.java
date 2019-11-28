package com.ustglobal.custmisedexception;

public class InvalidAgeException extends RuntimeException  {

	String message = "Invalid age below 18 years not allowed";
	public InvalidAgeException(String string) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
