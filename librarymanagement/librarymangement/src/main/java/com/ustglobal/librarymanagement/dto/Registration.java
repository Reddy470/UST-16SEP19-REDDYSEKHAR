package com.ustglobal.librarymanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Registration")
public class Registration {
	
	@Id
	@Column
	@GeneratedValue
	private int sno;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String phNo;
	@Column
	private String type;
	@Column
	private String pwd;
	
	
	/*
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "student_book", joinColumns = @JoinColumn(name="sno"),
	 * inverseJoinColumns = @JoinColumn(name="bid")) private List<AddBook>
	 * bookBeans;
	 */
	 
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/*
	 * public List<AddBook> getBookBeans() { return bookBeans; } public void
	 * setBookBeans(List<AddBook> bookBeans) { this.bookBeans = bookBeans; }
	 */
	
	
	

}
