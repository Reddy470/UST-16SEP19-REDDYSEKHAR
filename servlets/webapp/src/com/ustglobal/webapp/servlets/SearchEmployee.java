package com.ustglobal.webapp.servlets;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchEmployee  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("search");
		PrintWriter out = resp.getWriter();

		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id =?";
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		//EmployeeBean eb = null;

		try {
			//EmployeeBean eb1 = new EmployeeBean();

			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,Integer.parseInt(id));
			rs = pstmt.executeQuery();
			//ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();


			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				out.println("<html>");
				out.println("<body>");
				out.println("<table border='2'>");
				out.println("<tr>");
				out.println("<td>");
				out.println("Id");
				out.println("</td>");
				out.println("<td>");
				out.println("Name");
				out.println("</td>");
				out.println("<td>");
				out.println("Sal");
				out.println("</td>");
				out.println("<td>");
				out.println("Gender");
				out.println("</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>");
				out.println(bean.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(bean.getName());
				out.println("</td>");
				out.println("<td>");
				out.println(bean.getSal());
				out.println("</td>");
				out.println("<td>");
				out.println(bean.getGender());
				out.println("</td>");
				out.println("</tr>");

				out.println("</table>");
				out.println("</body>");
				out.println("</html>");



			}
			


		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {

			try {
				if(conn!=null);
				{
					conn.close();
				}
				if(pstmt!=null);{
					pstmt.close();
				}
				if (rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


}




