package com.model;

import java.util.List;
import java.util.Map;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	private List<Dealer>ld;
	private Map<Integer, Supplier>ms;
	
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

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public List<Dealer> getLd() {
		return ld;
	}

	public void setLd(List<Dealer> ld) {
		this.ld = ld;
	}

	public Map<Integer, Supplier> getMs() {
		return ms;
	}

	public void setMs(Map<Integer, Supplier> ms) {
		this.ms = ms;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", ld=" + ld + ", ms=" + ms + "]";
	}
		
}
