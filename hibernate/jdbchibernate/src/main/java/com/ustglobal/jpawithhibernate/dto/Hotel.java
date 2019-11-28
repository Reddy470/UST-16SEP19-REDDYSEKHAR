package com.ustglobal.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel_bills")
public class Hotel {
	@Id
	@Column(name="Item_Code")
	private int Item_Code;
	@Column(name="Food_Name")
	private String Food_Name;
	@Column(name="price")
	private double price;
	
	public int getItem_Code() {
		return Item_Code;
	}
	public void setId(int Item_Code) {
		this.Item_Code = Item_Code;
	}
	public String getFoodname() {
		return Food_Name;
	}
	public void setFoodname(String foodname) {
		this.Food_Name = foodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
