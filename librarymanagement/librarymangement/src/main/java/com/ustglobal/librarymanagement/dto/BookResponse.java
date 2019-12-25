package com.ustglobal.librarymanagement.dto;

import java.util.List;

public class BookResponse {
	
	private int statuscode;
	private String message;
	private String description;
	private List<AddBook> addBeans;
	private List<Registration> registrations;
	
	public int getStatuscode() {
		return statuscode;
	}
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<AddBook> getAddBeans() {
		return addBeans;
	}
	public void setAddBeans(List<AddBook> addBeans) {
		this.addBeans = addBeans;
	}
	public List<Registration> getRegistrations() {
		return registrations;
	}
	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}
	
	
	
	
	

	
	
	

}
