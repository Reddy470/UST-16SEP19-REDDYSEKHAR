package com.ustglobal.beanobject.bean;

public class Employee {
	private int id;
	private double salary;
	private String name;
	private String dept;
	private String desigination;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	public Employee(int id, double salary, String name, String dept, String desigination) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
		this.desigination = desigination;
	}
	public Employee() {

	}
	
	
	
	
}
