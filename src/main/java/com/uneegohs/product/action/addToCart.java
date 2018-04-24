package com.uneegohs.product.action;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spring.bean.UserSession;



public class addToCart extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String product_id;
	/*private String plancat;
	
	
	public String getPlancat() {
		return plancat;
	}

	public void setPlancat(String plancat) {
		this.plancat = plancat;
	}*/


	ArrayList<String> list; 
	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}


	@Autowired
	UserSession ses;
	public void setSes(UserSession ses) {
		this.ses = ses;
	}
	
	public String addToCart()
	{
		System.out.println("action class enterd");
		//System.out.println(getPlancat());
		System.out.println(getProduct_id());
		
		
		list=ses.getCartlist();
		list.add(getProduct_id());
		
		System.out.println("added to list");
		System.out.println(list);
		
		
		
		return "success";
	}
	

}
