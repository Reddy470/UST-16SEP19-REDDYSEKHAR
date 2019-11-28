package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class InsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		FileReader  reader = null;


		try {
			reader =new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			
			
		// step 1 :Loading 	The Driver
			
			Class.forName(prop.getProperty("driver-class-name"));
		// step 2: Get connection
			
			String url= "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			//step 3
			String sql=" insert into employee_info "
					+" values(4,'Susmitha',35000,'F'),(5,'Sekhar',250000,'M') ";
			stmt= conn.createStatement();
			int insert=stmt.executeUpdate(sql);
			// step4
			System.out.println(insert+" insert() values");
		}catch(Exception e) {e.printStackTrace();}
		
		// step 5
		
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {e.printStackTrace();}
		}
	}

}
