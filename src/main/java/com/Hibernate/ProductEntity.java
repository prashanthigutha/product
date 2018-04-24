package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {

	@Id
	String product_id ;
	String insurance_category ;
	String product_title ;
	String Product_description ;
	String monthly_premium ;
	String plan_id ;
	String zip;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getInsurance_category() {
		return insurance_category;
	}
	public void setInsurance_category(String insurance_category) {
		this.insurance_category = insurance_category;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public String getProduct_description() {
		return Product_description;
	}
	public void setProduct_description(String product_description) {
		Product_description = product_description;
	}
	public String getMonthly_premium() {
		return monthly_premium;
	}
	public void setMonthly_premium(String monthly_premium) {
		this.monthly_premium = monthly_premium;
	}
	public String getPlan_id() {
		return plan_id;
	}
	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	
	public ProductEntity(String product_id, String insurance_category, String product_title, String product_description,
			String monthly_premium, String plan_id, String zip) {
		super();
		this.product_id = product_id;
		this.insurance_category = insurance_category;
		this.product_title = product_title;
		Product_description = product_description;
		this.monthly_premium = monthly_premium;
		this.plan_id = plan_id;
		this.zip = zip;
	}
	
	
	public ProductEntity(String product_id) {
		super();
		this.product_id = product_id;
	}
	
	public ProductEntity()
	{
		
	}
	
	@Override
	public String toString() {
		return "product_id=" + product_id + ", insurance_category=" + insurance_category
				+ ", product_title=" + product_title + ", Product_description=" + Product_description
				+ ", monthly_premium=" + monthly_premium + ", plan_id=" + plan_id + ", zip=" + zip ;
	}
	
}
