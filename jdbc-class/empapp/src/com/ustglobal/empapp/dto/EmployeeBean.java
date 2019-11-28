package com.ustglobal.empapp.dto;

public class EmployeeBean {

	private int id;
	private String name;
	private int sal;
	private String gender;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getGenter() {
		return gender;
	}
	public void setGenter(String genter) {
		this.gender = genter;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", sal=" + sal + ", gender=" + gender + "]";
	}

}
