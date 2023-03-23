package com.model;

public class Dealer {
	
	private int dealerId;
	private String dealerName;
	private long dealerMobno;
	
	

		public int getDealerId() {
		return dealerId;
	}



	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}



	public String getDealerName() {
		return dealerName;
	}



	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}



	public long getDealerMobno() {
		return dealerMobno;
	}



	public void setDealerMobno(long dealerMobno) {
		this.dealerMobno = dealerMobno;
	}



		@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerMobno=" + dealerMobno + "]";
	}

}
