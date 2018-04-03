package com.uneegohs.product.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;


import java.util.ArrayList;

@Component
public class DisplayPlans extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	ArrayList<PlanDetailsDto> medicalplanList;
	ArrayList<PlanDetailsDto> dentalplanList;
	ArrayList<PlanDetailsDto> visionplanList;
	
	private int zipcode;
	
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
public ArrayList<PlanDetailsDto> getMedicalplanList() {
		return medicalplanList;
	}
	public void setMedicalplanList(ArrayList<PlanDetailsDto> medicalplanList) {
		this.medicalplanList = medicalplanList;
	}
	public ArrayList<PlanDetailsDto> getDentalplanList() {
		return dentalplanList;
	}
	public void setDentalplanList(ArrayList<PlanDetailsDto> dentalplanList) {
		this.dentalplanList = dentalplanList;
	}
	public ArrayList<PlanDetailsDto> getVisionplanList() {
		return visionplanList;
	}
	public void setVisionplanList(ArrayList<PlanDetailsDto> visionplanList) {
		this.visionplanList = visionplanList;
	}
	
	
	private void populateMedicalPlan()
	{
		medicalplanList = new ArrayList<PlanDetailsDto>();
		
		PlanDetailsDto a=new PlanDetailsDto();
		a.setPlanname("Medical Value");
		a.setPaymentmethod("Monthly");
		a.setCoinsurance(60);
		a.setDeductible(12500);
		a.setMaxoutpkt(1000);
		a.setPremiumamnt(66.90f);
		
		PlanDetailsDto b=new PlanDetailsDto();
		b.setPlanname("Medical Value plus");
		b.setPaymentmethod("Monthly");
		b.setCoinsurance(60);
		b.setDeductible(12500);
		b.setMaxoutpkt(1000);
		b.setPremiumamnt(66.90f);
		
		PlanDetailsDto c=new PlanDetailsDto();
		c.setPlanname("Medicare");
		c.setPaymentmethod("Monthly");
		c.setCoinsurance(60);
		c.setDeductible(12500);
		c.setMaxoutpkt(1000);
		c.setPremiumamnt(66.90f);
		
		medicalplanList.add(a);
		medicalplanList.add(b);
		medicalplanList.add(c);
		
		

	}
	
	
	private void populateDentalPlan()
	{
		dentalplanList = new ArrayList<PlanDetailsDto>();
		
		PlanDetailsDto a=new PlanDetailsDto();
		a.setPlanname("Dental Value");
		a.setPaymentmethod("Monthly");
		a.setCoinsurance(60);
		a.setDeductible(12500);
		a.setMaxoutpkt(1000);
		a.setPremiumamnt(66.90f);
		
		PlanDetailsDto b=new PlanDetailsDto();
		b.setPlanname("Dental Value plus");
		b.setPaymentmethod("Monthly");
		b.setCoinsurance(60);
		b.setDeductible(12500);
		b.setMaxoutpkt(1000);
		b.setPremiumamnt(66.90f);
		
		PlanDetailsDto c=new PlanDetailsDto();
		c.setPlanname("Dental");
		c.setPaymentmethod("Monthly");
		c.setCoinsurance(60);
		c.setDeductible(12500);
		c.setMaxoutpkt(1000);
		c.setPremiumamnt(66.90f);
		
		dentalplanList.add(a);
		dentalplanList.add(b);
		dentalplanList.add(c);
		
		

	}
	private void populateVisionPlan()
	{
		visionplanList = new ArrayList<PlanDetailsDto>();
		
		PlanDetailsDto a=new PlanDetailsDto();
		a.setPlanname("Vision Value");
		a.setPaymentmethod("Monthly");
		a.setCoinsurance(60);
		a.setDeductible(12500);
		a.setMaxoutpkt(1000);
		a.setPremiumamnt(66.90f);
		
		PlanDetailsDto b=new PlanDetailsDto();
		b.setPlanname("Vision Value plus");
		b.setPaymentmethod("Monthly");
		b.setCoinsurance(60);
		b.setDeductible(12500);
		b.setMaxoutpkt(1000);
		b.setPremiumamnt(66.90f);
		
		PlanDetailsDto c=new PlanDetailsDto();
		c.setPlanname("Vision");
		c.setPaymentmethod("Monthly");
		c.setCoinsurance(60);
		c.setDeductible(12500);
		c.setMaxoutpkt(1000);
		c.setPremiumamnt(66.90f);
		
		visionplanList.add(a);
		visionplanList.add(b);
		visionplanList.add(c);
		
		

	}
public String displayPlans ()
	{
		
	populateMedicalPlan();
	populateDentalPlan();
	populateVisionPlan();
	

	if(zipcode==75062)
		return "success";
	else
		return "failure";
}
}
