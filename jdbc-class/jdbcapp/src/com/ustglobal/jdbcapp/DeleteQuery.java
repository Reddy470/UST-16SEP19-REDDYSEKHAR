package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DeleteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//step 1
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn= DriverManager.getConnection(url);
			
			//step 3
			
			String sql = " delete from employee_info  where id=4 ";
			stmt = conn.createStatement();
			int delete = stmt.executeUpdate(sql);
			
			//step 4
				System.out.println(delete+"Row(s) delete");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
