package com.uneegohs.product.action;

public class PlanDetailsDto {

	
	private String planname;
	private float Coinsurance;
	private float Deductible;
	private String Paymentmethod;
	private float  Maxoutpkt;
	private float premiumamnt;
	public float getPremiumamnt() {
		return premiumamnt;
	}
	public void setPremiumamnt(float premiumamnt) {
		this.premiumamnt = premiumamnt;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public float getCoinsurance() {
		return Coinsurance;
	}
	public void setCoinsurance(float coinsurance) {
		Coinsurance = coinsurance;
	}
	public float getDeductible() {
		return Deductible;
	}
	public void setDeductible(float deductible) {
		Deductible = deductible;
	}
	public String getPaymentmethod() {
		return Paymentmethod;
	}
	public void setPaymentmethod(String paymentmethod) {
		Paymentmethod = paymentmethod;
	}
	public float getMaxoutpkt() {
		return Maxoutpkt;
	}
	public void setMaxoutpkt(float maxoutpkt) {
		Maxoutpkt = maxoutpkt;
	}
	
	
}
