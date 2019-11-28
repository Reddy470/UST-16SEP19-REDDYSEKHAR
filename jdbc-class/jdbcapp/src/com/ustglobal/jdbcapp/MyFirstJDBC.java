package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection  conn = null;
		Statement stmt =null;
		ResultSet rs = null;
		try {
			
		// step 1 :Loading 	The Driver
			
			Driver driver = new Driver();			//step 1 loading the driver
			DriverManager.registerDriver(driver);	
			
		// step 2: Get connection
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url, "root", "root");
			
		// step 3 :Issue SQL query
			
			String sql = "select * from employee_info";
			stmt = conn.createStatement();
			rs =stmt.executeQuery(sql);
			
		// step 4: Read The Results
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getNString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				
				System.out.println("id :"+id);
				System.out.println("name :"+name);
				System.out.println("salary:"+sal);
				System.out.println("gender :"+gender);
				System.out.println("*****************");
			}
		
		} catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			// Step 5: Close All JDBC Objects
			try {
				if(conn!=null);
				{
				conn.close();
				}
			if(stmt!=null);{
			stmt.close();
			}
			if (rs!=null) {rs.close();}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
	


