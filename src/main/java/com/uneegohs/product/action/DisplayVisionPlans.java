package com.uneegohs.product.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class DisplayVisionPlans extends ActionSupport{

private static final long serialVersionUID = 1L;
	
	ArrayList<PlanDetailsDto> planList;
	
	private int zipcode;
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public ArrayList<PlanDetailsDto> getPlanList() {
		return planList;
	}
	public void setPlanList(ArrayList<PlanDetailsDto> planList) {
		this.planList = planList;
	}
	
	
	
public String showVisionPlans ()
	{
	planList = new ArrayList<PlanDetailsDto>();
	
	PlanDetailsDto a=new PlanDetailsDto();
	a.setPlanname("Medical Value");
	a.setPaymentmethod("Monthly");
	a.setCoinsurance(60);
	a.setDeductible(12500);
	a.setMaxoutpkt(1000);
	a.setPremiumamnt(66.90f);
	
	
	planList.add(a);
	
	
	
	if(zipcode==75062)
		return "success";
	else
		return "failure";
}
}
