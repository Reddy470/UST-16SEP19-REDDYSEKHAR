package com.ustglobal.webapp.beans;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "product")
public class Product {
	@Column
	private int orderid;
	@Column
	private String ProductName;
	@Column
	private int PriceperUnit;
	@Column
	private int Quantity;
	@Column
	private double AmountPayble;
	@Column
	private Retailer retailer;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getPriceperUnit() {
		return PriceperUnit;
	}
	public void setPriceperUnit(int priceperUnit) {
		PriceperUnit = priceperUnit;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getAmountPayble() {
		return AmountPayble;
	}
	public void setAmountPayble(double amountPayble) {
		AmountPayble = amountPayble;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	
	
	

}
