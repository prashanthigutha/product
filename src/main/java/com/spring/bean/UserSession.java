package com.spring.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(value="session")
@Component
public class UserSession {
	private String email;
	private String zip;
	
ArrayList<String> cartlist=new ArrayList<String>();

	//HashSet cartset=new HashSet();
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("entered session class");
		this.email = email;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public ArrayList<String> getCartlist() {
		return cartlist;
	}

	public void setCartlist(ArrayList<String> cartlist) {
		this.cartlist = cartlist;
	}

}
