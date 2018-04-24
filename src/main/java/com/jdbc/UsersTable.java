package com.jdbc;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.uneegohs.product.action.*;
import java.util.*;

public class UsersTable {

	public static boolean insertProduct( Connection conn ,String product_id,String insurance_category,String product_title,String Product_description,float monthly_premium,String plan_id,String zip) throws  SQLException
    {
        PreparedStatement stmt = null;
        
        try
        {
            stmt = conn.prepareStatement("insert into product(product_id,insurance_category,product_title,Product_description,monthly_premium,plan_id,zip) values(?,?,?,?,?,?,?)");
	
            stmt.setString(1, product_id);
            stmt.setString(2, insurance_category);
            stmt.setString(3, product_title);
            stmt.setString(4, Product_description);
            stmt.setFloat(5, monthly_premium);
            stmt.setString(6, plan_id);
            stmt.setString(7, zip);
            
            
           if( stmt.executeUpdate()!=0)
        	   return true;
           else
        	   return false;
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
    }
	
	
	
	public static boolean insertDetails( Connection conn ,String email_id,String product_id,String insurance_category) throws  SQLException
	{
		PreparedStatement stmt=null;
		try{
			stmt=conn.prepareStatement("insert into opportunity(email_id,product_id,insurance_category) values (?,?,?)");
			
			stmt.setString(1, email_id);
			stmt.setString(2, product_id);
			stmt.setString(3, insurance_category);
			
			 if( stmt.executeUpdate()!=0)
	        	   return true;
	           else
	        	   return false;
	        
			
			
		}catch(SQLException e)
		{
			throw e;
		}
		finally
		{
			try{
				stmt.close();
			}catch(SQLException s)
			{
			}
		}
	}
	
	
	
	//updateOrder("john","new_pasword")
	public static void updatePwd(String uid,String pwd, Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("update users set password=? where user=?");
            stmt.setString(1, pwd);
            stmt.setString(2, uid);
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }
	

	public static int deleteUser(String delUid,Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("delete from opportunity where email_id=?");
            stmt.setString(1, delUid);
            int rowsupdated=stmt.executeUpdate();
            return rowsupdated;
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }

	public static ArrayList<PlanDetailsDto> getPlanDetails(String insurance_cat,String zip,Connection conn) throws SQLException 
    {
		
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        
        
        ArrayList<PlanDetailsDto> result=new ArrayList<PlanDetailsDto>();
        
        try
        {
        	stmt = conn.prepareStatement("select a.product_id,a.product_title,b.co_insurance,b.deductible,b.mop,a.monthly_premium from product a, plan b where a.plan_id=b.plan_id and a.insurance_category=?and a.zip=?");
            stmt.setString(1,insurance_cat );
            stmt.setString(2, zip);
            resultSet = stmt.executeQuery();
            while (resultSet.next())
            {
            	PlanDetailsDto dto=new PlanDetailsDto();
            	
            	dto.setProduct_id(resultSet.getString("product_id"));
            	dto.setCoinsurance(resultSet.getString("co_insurance"));
            	dto.setDeductible(resultSet.getString("deductible"));
            	dto.setMaxoutpkt(resultSet.getString("mop"));
            	dto.setPlanname(resultSet.getString("product_title"));
            	dto.setPremiumamnt(resultSet.getString("monthly_premium"));
            	
            	result.add(dto);
            }
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occired");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
        return result;
    }



	public static String[] validateLogin(String userid,String pwd,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        String[] result=new String[2];
        try
        {
        	stmt = conn.prepareStatement("select firstname,lastname from users where user=? and password=?");
        	stmt.setString(1, userid);
        	stmt.setString(2, pwd);
            resultSet = stmt.executeQuery();
            if(resultSet.next())
            {
            	result[0]=resultSet.getString(1);
            	result[1]=resultSet.getString(2);
            }
            return result;
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occired");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
            
        }
        
    }



	public static ArrayList<PlanDetailsDto> getPlanDetailsWithFilters(String insurance_cat,String zip, float min_mon_pre,float max_mon_pre, float min_co_ins, float max_co_ins, float min_mop, float max_mop, Connection conn) throws SQLException {
	
		PreparedStatement stmt = null;
        ResultSet resultSet = null;
        
        
        ArrayList<PlanDetailsDto> result=new ArrayList<PlanDetailsDto>();
        
        try
        {
        	stmt = conn.prepareStatement("select a.product_id,a.product_title,b.co_insurance,b.deductible,b.mop,a.monthly_premium from product a, plan b"+
        										" where a.plan_id=b.plan_id and a.insurance_category=?and a.zip=?"+
        										" and (a.monthly_premium>? and a.monthly_premium<=? )"+
        										"and (b.co_insurance>? and b.co_insurance<=?)"+
        										"and(b.mop>? and b.mop<= ?)");
            stmt.setString(1,insurance_cat );
            stmt.setString(2, zip);
            stmt.setFloat(3,min_mon_pre);
            stmt.setFloat(4,max_mon_pre);
            stmt.setFloat(5,min_co_ins);
            stmt.setFloat(6,max_co_ins);
            stmt.setFloat(7,min_mop);
            stmt.setFloat(8,max_mop);
           
            
            
            resultSet = stmt.executeQuery();
            while (resultSet.next())
            {
            	PlanDetailsDto dto=new PlanDetailsDto();
            	
            	dto.setProduct_id(resultSet.getString("product_id"));
            	dto.setCoinsurance(resultSet.getString("co_insurance"));
            	dto.setDeductible(resultSet.getString("deductible"));
            	dto.setMaxoutpkt(resultSet.getString("mop"));
            	dto.setPlanname(resultSet.getString("product_title"));
            	dto.setPremiumamnt(resultSet.getString("monthly_premium"));
            	
            	result.add(dto);
            }
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occired");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
        return result;
		
	}



	public static ArrayList<PlanDetailsDto> getCartPlanDetails(String product_id, Connection conn) throws Exception {
		
		 PreparedStatement stmt = null;
	        ResultSet resultSet = null;
	        
	        
	        ArrayList<PlanDetailsDto> result=new ArrayList<PlanDetailsDto>();
	        
	        try
	        {
	        	stmt = conn.prepareStatement("select a.product_id,a.product_title,b.co_insurance,b.deductible,b.mop,a.monthly_premium from product a, plan b where a.plan_id=b.plan_id and a.product_id=?");
	            stmt.setString(1,product_id );
	            
	            resultSet = stmt.executeQuery();
	            while (resultSet.next())
	            {
	            	PlanDetailsDto dto=new PlanDetailsDto();
	            	
	            	dto.setProduct_id(resultSet.getString("product_id"));
	            	dto.setCoinsurance(resultSet.getString("co_insurance"));
	            	dto.setDeductible(resultSet.getString("deductible"));
	            	dto.setMaxoutpkt(resultSet.getString("mop"));
	            	dto.setPlanname(resultSet.getString("product_title"));
	            	dto.setPremiumamnt(resultSet.getString("monthly_premium"));
	            	
	            	result.add(dto);
	            }
	        }
	        catch (SQLException e)
	        {
	        	System.out.println("Exception occired");
	        	e.printStackTrace();
	            throw e;
	        }
	        finally
	        {
	        	try{
	        		resultSet.close(); } catch(SQLException s){}
	            try{
	            	stmt.close();} catch(SQLException s){}
	        }
	        
	        return result;
	    }


	
}
