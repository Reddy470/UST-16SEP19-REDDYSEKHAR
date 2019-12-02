package com.ustglobal.webapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column
	private int orderId;
	@Column
	private String ProductName;
	@Column
	private int PriceperUnit;
	@Column
	private int Quantity;
	@Column
	private double AmountPayble;
	
	public Product() {
		
	}
	
	
	
	
	public Product(int orderId, String productName, int priceperUnit, int quantity, double amountPayble) {
		super();
		this.orderId = orderId;
		ProductName = productName;
		PriceperUnit = priceperUnit;
		Quantity = quantity;
		AmountPayble = amountPayble;
	}




	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderid) {
		this.orderId = orderid;
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

	
	

}
