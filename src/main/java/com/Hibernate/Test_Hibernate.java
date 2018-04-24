package com.Hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;




public class Test_Hibernate {
	public static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	 //Session session=new AnnotationConfiguration()  
	        // .configure().buildSessionFactory().openSession();  

	public static void main(String args[]) throws Exception
	{
		
		try{
			boolean auth=false;

			/*String res=ProductsTable.insertProductHibernate("234008","Vision","Short Term Medical Value","abc","66.90","Value A","75062",factory);
			System.out.println(res);*/
			
			ArrayList<ProductEntity> ue=ProductsTable.getPlanDetailsByCategoryHibernate("Vision",factory);
			
			
			System.out.println(ue);
			
			System.out.println(ue.size());
			
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				try{
				}catch(Exception e){}
			}
		}
	
	
	
	}


