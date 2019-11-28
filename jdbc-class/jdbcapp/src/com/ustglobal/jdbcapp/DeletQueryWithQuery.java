package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DeletQueryWithQuery {
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//step 1 :load the driver
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			//  step 2:get the connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			//step 3 : issue the sql query
			String sql =prop.getProperty("delete-query");
			pstmt=conn.prepareStatement(sql);
			
			String empid=args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
		
			
			int update= pstmt.executeUpdate();
			
			//step 4
			
			System.out.println(update + "Rows(s) Delete");
			
			
			
		}catch(Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception s) {s.printStackTrace();}
		}
	}



}
