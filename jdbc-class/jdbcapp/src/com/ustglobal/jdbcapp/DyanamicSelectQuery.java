package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DyanamicSelectQuery {
	public static void main(String[] args) {
	  String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	  String sql = "select * from employee_info where id=?";
	  Connection conn = null;
	  PreparedStatement pstmt = null;
	  ResultSet rs = null;
	  try {
		  //step 1  LOAD THE DRIVER
		  Driver driver = new Driver();
		  DriverManager.registerDriver(driver);
		  
		 // step2 GET CONNECTION
		  
		  conn = DriverManager.getConnection(url);
		  
		  //step 3 ISSUES SQL QUERY
		  pstmt=conn.prepareStatement(sql);
		  String empid = args[0];
		  int id = Integer.parseInt(empid);
		  pstmt.setInt(1, id);
		  
		  rs= pstmt.executeQuery();
		  
		  //step 4 
		  
		  if(rs.next()) {
			  int idemp = rs.getInt("id");
			  int sal = rs.getInt("sal");
			  String name = rs.getString("name");
			  String gender = rs.getString("gender");
			  
			  System.out.println("Id is:"+idemp);
			  System.out.println("Salary is:"+sal);
			 System.out.println("Name is :"+name);
			 System.out.println("Gender is:"+gender);
		  }
		  
	  }
	  catch(SQLException e) 
	  {
		  e.printStackTrace();
		  }
	  finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
