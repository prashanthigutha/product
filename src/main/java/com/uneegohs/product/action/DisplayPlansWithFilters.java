package com.uneegohs.product.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jdbc.DatabaseConnection;
import com.jdbc.UsersTable;
import com.opensymphony.xwork2.ActionSupport;
import com.spring.bean.UserSession;

import java.sql.Connection;
import java.util.ArrayList;



public class DisplayPlansWithFilters extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserSession ses;
	
	public void setSes(UserSession ses) {
		this.ses = ses;
	}
	
	



	//Three array lists for three types of plans and their getters and setters
	ArrayList<PlanDetailsDto> medicalplanList;
	ArrayList<PlanDetailsDto> dentalplanList;
	ArrayList<PlanDetailsDto> visionplanList;
	
	
	private String monthlypremium;
	private String co_insurance;
	private String mop;
	
	
	
	
	public String getMonthlypremium() {
		return monthlypremium;
	}
	public void setMonthlypremium(String monthlypremium) {
		this.monthlypremium = monthlypremium;
	}
	
	public String getCo_insurance() {
		return co_insurance;
	}
	public void setCo_insurance(String co_insurance) {
		this.co_insurance = co_insurance;
	}
	public String getMop() {
		return mop;
	}
	public void setMop(String mop) {
		this.mop = mop;
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
	
	
	
	float min_mon_pre,max_mon_pre;
	float min_co_ins,max_co_ins;
	float min_mop,max_mop;
		
	
	public void convetStringToMin_Max()
	{
	String mon_pre=getMonthlypremium();
	String co_ins=getCo_insurance();
	String max_out_p=getMop();
	
	mon_pre=mon_pre.replaceAll("\\$","");
	mon_pre=mon_pre.replaceAll(" ", "");
	
	String []temp1=mon_pre.split("To");
	min_mon_pre=Float.parseFloat(temp1[0]);
	max_mon_pre=Float.parseFloat(temp1[1]);
	
	
	co_ins=co_ins.replaceAll("\\%","");
	co_ins=co_ins.replaceAll(" ","");
	
	
	String []temp2=co_ins.split("To");
	min_co_ins=Float.parseFloat(temp2[0]);
	max_co_ins=Float.parseFloat(temp2[1]);
	
	max_out_p=max_out_p.replaceAll("\\$","");
	max_out_p=max_out_p.replaceAll(" ","");
	
	String []temp3=max_out_p.split("To");
	min_mop=Float.parseFloat(temp3[0]);
	max_mop=Float.parseFloat(temp3[1]);
	
	System.out.println(min_mon_pre);
	System.out.println(max_mon_pre);
	System.out.println(min_co_ins);
	System.out.println(max_co_ins);
	System.out.println(min_mop);
	System.out.println(max_mop);
	
	System.out.println(ses.getZip());
	
	
	}
	/*ArrayList<PlanDetailsDto> medicalplanList_fiters;
	ArrayList<PlanDetailsDto> dentalplanList_filters;
	ArrayList<PlanDetailsDto> visionplanList_fiters;*/
	
	private void populateMedicalPlan() throws Exception
	{
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

			
		medicalplanList=UsersTable.getPlanDetailsWithFilters("Medical", "75062",min_mon_pre,max_mon_pre, min_co_ins,max_co_ins, min_mop,max_mop,conn);
			//medicalplanList=UsersTable.getPlanDetails("Medical", conn);
			
			//medicalplanList_fiters=getFilteredList(medicalplanList);
				
		
	//	medicalplanList=getFilteredList(UsersTable.getPlanDetails("Medical", conn));
		    conn.commit();
		}catch(Exception e)
		{	e.printStackTrace();
			
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

		dentalplanList=UsersTable.getPlanDetailsWithFilters("Dental", ses.getZip(),min_mon_pre,max_mon_pre, min_co_ins,max_co_ins, min_mop,max_mop,conn);
		
				//dentalplanList=UsersTable.getPlanDetails("Dental", conn);
				//dentalplanList_filters=getFilteredList(dentalplanList);*/
		
	//	dentalplanList=getFilteredList(UsersTable.getPlanDetails("Dental", conn));
		    conn.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
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

		
		visionplanList=UsersTable.getPlanDetailsWithFilters("Vision", ses.getZip(),min_mon_pre,max_mon_pre, min_co_ins,max_co_ins, min_mop,max_mop,conn);
		
				//visionplanList=UsersTable.getPlanDetails("Vision", conn);
				//visionplanList_fiters=getFilteredList(visionplanList);
		
		//visionplanList=getFilteredList(UsersTable.getPlanDetails("Vision", conn));
		    conn.commit();
		}catch(Exception e)
		{
			e.printStackTrace();
		conn.rollback();
		}
		finally{
		conn.close();
		}
		

	}
	
	
	
	
	
	
	
	
	
public String displayPlans () 
	{
		
	/*System.out.println(getMonthlypremium());
	System.out.println(getCo_insurance());
	System.out.println(getMop());
	*/
	
	try{
		
		
	convetStringToMin_Max();
	
	populateMedicalPlan();
	populateDentalPlan();
	populateVisionPlan();
	
	}catch(Exception e){
		e.printStackTrace();
	}

	/*if(zipcode.length()==5)
		return "success";
	else
		return "failure";*/
	return "success";
}


}













/*public ArrayList<PlanDetailsDto> getFilteredList(ArrayList<PlanDetailsDto> planList){
	
	ArrayList<PlanDetailsDto> filterdlist=new ArrayList<PlanDetailsDto>();
for(PlanDetailsDto ls:planList)
{
	
	
	float mon_pre=Float.parseFloat(ls.getPremiumamnt());
	float co_ins=Float.parseFloat(ls.getCoinsurance());
	float max_op=Float.parseFloat(ls.getMaxoutpkt()); 
	
	System.out.println(mon_pre);
	System.out.println(co_ins);
	System.out.println(max_op);
	
	
	
	//first three combinations
	if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	//For other 3 combinations
	
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>60)&&(co_ins<=80))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>60)&&(co_ins<=80))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("60% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>60)&&(co_ins<=80))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	//For other 3 combinations
	
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>80)&&(co_ins<=100))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>80)&&(co_ins<=100))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$0 To $50"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>=0)&&(mon_pre<=50))&&((co_ins>80)&&(co_ins<=100))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	//For other 3 combinations
	
	if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>50)&&(mon_pre<100))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	//For other 3 combinations
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>60)&&(co_ins<=80))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>60)&&(co_ins<=80))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("60% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>60)&&(co_ins<=80))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	//For other 3 combinations
	
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>80)&&(co_ins<=100))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>80)&&(co_ins<=100))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$50 To $100"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>50)&&(mon_pre<=100))&&((co_ins>80)&&(co_ins<=100))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	//For other 3 combinations
	
	if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("40% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>=40)&&(co_ins<=60))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	//For other 3 combinations
	
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>60)&&(co_ins<=80))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("60% To 80%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>60)&&(co_ins<=80))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("60% To 60%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>60)&&(co_ins<=80))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	//For other 3 combinations
	
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$0 To $2000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>80)&&(co_ins<=100))&&((max_op>=0)&&(max_op<=2000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$2000 To $5000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>80)&&(co_ins<=100))&&((max_op>2000)&&(max_op<=5000)))
			filterdlist.add(ls);
	}
	else if((getMonthlypremium().equalsIgnoreCase("$100 To $150"))&&(getCo_insurance().equalsIgnoreCase("80% To 100%"))&&(getMop().equalsIgnoreCase("$5000 To $10000")))
	{
		if(((mon_pre>100)&&(mon_pre<=150))&&((co_ins>80)&&(co_ins<=100))&&((max_op>5000)&&(max_op<=10000)))
			filterdlist.add(ls);
	}
	
	
	
	}

  return filterdlist;

 }
}
*/