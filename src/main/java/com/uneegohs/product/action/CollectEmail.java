package com.uneegohs.product.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class CollectEmail extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String user_email,zipcode;

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String gatheringEmailId(){
		String result;
	if(zipcode.length()==5)
			{
				 result="success";
			}
	else
		result="failure";
	
	return result;
	
	}
}
