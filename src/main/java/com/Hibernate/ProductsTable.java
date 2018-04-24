package com.Hibernate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;





public class ProductsTable {



		 
		public static String insertProductHibernate(String product_id, String insurance_category,String product_title,String Product_description,String monthly_premium,String plan_id,String zip,SessionFactory factory) throws  SQLException
	    {
			  Session session = factory.openSession();
		      Transaction tx = null;
		      String result= null;
		      try{
		         tx = session.beginTransaction();
		         ProductEntity employee = new ProductEntity (product_id,insurance_category,product_title,Product_description,monthly_premium,plan_id,zip);
		         result = (String) session.save(employee);
		         tx.commit();
		         
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		      }finally {
		         session.close(); 
		      }
		      
		      return result;
	    }

		
		
		/*select a.product_title,b.co_insurance,b.deductible,b.mop,a.monthly_premium from product a, plan b 
		where a.plan_id=b.plan_id and a.insurance_category='Medical'*/
		
		public static ArrayList<ProductEntity> getPlanDetailsByCategoryHibernate(String insurance_cat,SessionFactory factory) throws SQLException 
	    {
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		         tx = session.beginTransaction();
		        /* String hql = "select E.product_title FROM ProductEntity E WHERE E.insurance_category= :param1";
		         Query query = session.createQuery(hql);
		         query.setParameter("param1", insurance_cat);*/

		       Query query=session.createQuery("select product_title,monthly_premium FROM ProductEntity WHERE insurance_category='Vision'");
		         
		      //  ArrayList<ProductEntity> result=(ArrayList<ProductEntity>)session.get(ProductEntity.class, product_id);
		         ArrayList<ProductEntity> result=(ArrayList<ProductEntity>)query.list();
		         if(result==null)
		        	 return null; // -1 if recrd not found
		         //ProductEntity product = (ProductEntity) result;
		         return result;
		      }catch (HibernateException e) {
		         if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
		         return null;// -2 if internal hibernate error.
		      }finally {
		         session.close(); 
		      }
	    }
}
