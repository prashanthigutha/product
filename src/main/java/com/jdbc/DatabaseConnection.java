package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getDBConnection( ) throws Exception
	{
		Connection conn =null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance_product?useSSL=false","root","prashanthi"); 
		  return conn;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
}
