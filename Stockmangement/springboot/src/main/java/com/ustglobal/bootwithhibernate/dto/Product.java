package com.ustglobal.bootwithhibernate.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "product_info")
public class Product {
	@Id
	@Column
	@GeneratedValue
	private int product_id;
	@Column
	private String name;
	@Column
	private String catogory;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;


	@Exclude

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "product_info") private
	List<ProductOrder> productOrders;



	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public List<ProductOrder> getProductOrders() {
		return productOrders;
	}
	public void setProductOrders(List<ProductOrder> productOrders) {
		this.productOrders = productOrders;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatogory() {
		return catogory;
	}
	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



}
