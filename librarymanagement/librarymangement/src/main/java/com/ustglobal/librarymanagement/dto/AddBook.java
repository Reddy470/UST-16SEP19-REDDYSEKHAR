package com.ustglobal.librarymanagement.dto;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "AddBook")
public class AddBook {
	@Id
	@Column
	@GeneratedValue
	private int bid;
	@Column
	private String bname;
	@Column
	private String authour;
	@Column
	private Double price ;
	@Column
	@JsonFormat(pattern = "yyy-MM-dd")
	private Date DOE;


	/*
	 * @Exclude
	 * 
	 * @ManyToMany(cascade = CascadeType.ALL, mappedBy = "bookBeans") private
	 * List<Registration> studentBeans;
	 * 
	 */

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getDOE() {
		return DOE;
	}
	public void setDOE(Date dOE) {
		DOE = dOE;
	}
	/*
	 * public List<Registration> getStudentBeans() { return studentBeans; } public
	 * void setStudentBeans(List<Registration> studentBeans) { this.studentBeans =
	 * studentBeans; }
	 */


}
