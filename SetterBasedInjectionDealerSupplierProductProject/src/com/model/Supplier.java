package com.model;

import java.util.List;

public class Supplier {
	
	private int supId;
	private String supName;
	private long supMobno;
	private List<String>cities;
	
		public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public long getSupMobno() {
		return supMobno;
	}

	public void setSupMobno(long supMobno) {
		this.supMobno = supMobno;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

		@Override
	public String toString() {
		return "Supplier [supId=" + supId + ", supName=" + supName + ", supMobno=" + supMobno + ", cities=" + cities
				+ "]";
	}
		

}
