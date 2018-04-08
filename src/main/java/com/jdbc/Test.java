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

		//UsersTable.insertUser(conn,"234006","Medical","Short Term Medical Value","abc",66.90f,"Value A","75062");
		
		ArrayList<PlanDetailsDto> result=	UsersTable.getPlanDetails("Medical", conn);
		System.out.println(result.size());
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
