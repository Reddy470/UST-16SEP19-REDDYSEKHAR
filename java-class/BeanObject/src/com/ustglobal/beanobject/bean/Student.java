package com.ustglobal.beanobject.bean;

public class Student {
	
	private int id;
	private String name;
	private int rollno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int roolno) {
		this.rollno = roolno;
	}
	public Student(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public Student() {

	}
	
	

}
