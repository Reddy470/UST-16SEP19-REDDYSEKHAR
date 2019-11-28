package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		Connection  conn = null;
		Statement stmt =null;
		ResultSet rs = null;
		FileReader  reader = null;
		
		try {
			reader =new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			
		// step 1 :Loading 	The Driver
			
			Class.forName(prop.getProperty("driver-class-name"));
		// step 2: Get connection
			
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url, prop);
			
		// step 3 :Issue SQL query
			
			String sql = prop.getProperty("select-query");
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
		
		} catch(Exception e) {
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
			if (rs!=null) {
				rs.close();
				}
			if(reader!=null) {
				reader.close();
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
