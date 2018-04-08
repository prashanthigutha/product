package com.uneegohs.product.action;

import org.springframework.stereotype.Component;

import com.jdbc.DatabaseConnection;
import com.jdbc.UsersTable;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.util.ArrayList;

@Component
public class DisplayPlans extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	ArrayList<PlanDetailsDto> medicalplanList;
	ArrayList<PlanDetailsDto> dentalplanList;
	ArrayList<PlanDetailsDto> visionplanList;
	
	private String zipcode;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
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
	
	
	private void populateMedicalPlan() throws Exception
	{
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

		//UsersTable.insertUser(conn,"234006","Medical","Short Term Medical Value","abc",66.90f,"Value A","75062");
		
		
				medicalplanList=UsersTable.getPlanDetails("Medical", conn);
		
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

		//UsersTable.insertUser(conn,"234006","Medical","Short Term Medical Value","abc",66.90f,"Value A","75062");
		
		
				dentalplanList=UsersTable.getPlanDetails("Dental", conn);
		
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

		//UsersTable.insertUser(conn,"234006","Medical","Short Term Medical Value","abc",66.90f,"Value A","75062");
		
		
				visionplanList=UsersTable.getPlanDetails("Vision", conn);
		
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
		
	try{
	populateMedicalPlan();
	populateDentalPlan();
	populateVisionPlan();
	
	}catch(Exception e){
		e.printStackTrace();
	}

	if(zipcode.length()==5)
		return "success";
	else
		return "failure";
}
}
