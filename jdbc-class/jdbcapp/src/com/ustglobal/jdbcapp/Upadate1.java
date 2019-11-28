package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Upadate1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			//step 1 :load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
//			
			//  step 2:get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			//step 3 : issue the sql query
			String sql ="update employee_info set name=?,sal=?,gender=? where id=?";
			pstmt=conn.prepareStatement(sql);
			
			String empid=args[0];
			int id = Integer.parseInt(empid);
		
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender =args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			int update= pstmt.executeUpdate();
			
			//step 4
			
			System.out.println(update + "Rows(s) Update");
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// step 5
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException s) {s.printStackTrace();}
		}
	}

}
