package com.eshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Tabl1")
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private int price;

	
	
	
	@Override
	public String toString() {
		return "User [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
