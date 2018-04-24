package com.uneegohs.product.action;
import com.spring.bean.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jdbc.DatabaseConnection;
import com.jdbc.UsersTable;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;



public class DisplayPlans extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	ArrayList<PlanDetailsDto> medicalplanList;
	ArrayList<PlanDetailsDto> dentalplanList;
	ArrayList<PlanDetailsDto> visionplanList;
	ArrayList<PlanDetailsDto> cartplanList;
	
	
	


	private String zipcode;
	private String email;
	
	
	
	
	
public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	 public ArrayList<PlanDetailsDto> getCartplanList() {
			return cartplanList;
		}
		public void setCartplanList(ArrayList<PlanDetailsDto> cartplanList) {
			this.cartplanList = cartplanList;
		}
	
	
	@Autowired
	UserSession ses;
	public void setSes(UserSession ses) {
		this.ses = ses;
	}
	
	

	
	
	
	private void populateMedicalPlan() throws Exception
	{
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

				medicalplanList=UsersTable.getPlanDetails("Medical",getZipcode(), conn);
				
				
		
		    conn.commit();
		}catch(Exception e)
		{
		conn.rollback();
		}
		finally{
		conn.close();
		}
		

	}
	
	
	private void populateDentalPlan() throws Exception
	{
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

				dentalplanList=UsersTable.getPlanDetails("Dental",getZipcode(), conn);
		
		    conn.commit();
		}catch(Exception e)
		{
		conn.rollback();
		}
		finally{
		conn.close();
		}

	}
	private void populateVisionPlan() throws Exception
	{
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

				visionplanList=UsersTable.getPlanDetails("Vision",getZipcode(), conn);
		
		    conn.commit();
		}catch(Exception e)
		{
		conn.rollback();
		}
		finally{
		conn.close();
		}
		

	}
	
	private void populateViewCart() throws Exception{
		
		Connection conn=null;
		ArrayList<String> list=ses.getCartlist();
		//Iterator itr=list.iterator();
		
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);
		for(String ls:list)
		{ 
		
				cartplanList=UsersTable.getCartPlanDetails(ls, conn);
		}
		    conn.commit();
		}catch(Exception e)
		{
		conn.rollback();
		}
		finally{
		conn.close();
		}
		
		
	}
	
	
	
	

public String displayPlans () 
	{
		
	System.out.println (getZipcode());
	System.out.println(getEmail());
	try{
		
		ses.setEmail(email);
		ses.setZip(zipcode);
		
		
	populateMedicalPlan();
	populateDentalPlan();
	populateVisionPlan();
	populateViewCart();
	
	
	}catch(Exception e){
		e.printStackTrace();
	}

	if(zipcode.length()==5)
		return "success";
	else
		return "failure";
}

}
