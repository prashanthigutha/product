package com.jdbc;
import java.sql.*;
import java.util.ArrayList;

import com.uneegohs.product.action.PlanDetailsDto;
public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		Connection conn=null;
		try{
		conn=DatabaseConnection.getDBConnection();
		conn.setAutoCommit(false);

		float min_mon_pre=50f;
		float max_mon_pre=100f;
		float  min_co_ins=40f;
		float max_co_ins=60f;
		float min_mop=5000f;
		float max_mop=10000f;
		//UsersTable.insertUser(conn,"234006","Medical","Short Term Medical Value","abc",66.90f,"Value A","75062");
		
		//ArrayList<PlanDetailsDto> result=	UsersTable.getPlanDetails("Medical", "75062",conn);
		ArrayList<PlanDetailsDto> result=	UsersTable.getPlanDetailsWithFilters("Dental", "75062",min_mon_pre,max_mon_pre, min_co_ins,max_co_ins, min_mop,max_mop,conn);
		System.out.println(result.size());
		
		for(PlanDetailsDto l:result)
			System.out.println(l.getProduct_id());
		//UsersTable.insertDetails(conn,"prashanthi_4@yahoo.co.in","234007","Vision");
		
		//System.out.println(UsersTable.deleteUser("shanthigutha@gmail.com",conn));
		    conn.commit();
		}catch(Exception e)
		{
		conn.rollback();
		}
		finally{
		conn.close();
		}
	}

}
