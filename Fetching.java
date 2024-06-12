package com.ty.fetchApp;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fetching extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String eid=req.getParameter("eid");
		int id=Integer.parseInt(eid);
		
		
		
//			JDBC CODE
		
		String fqcn="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=bushra@23";
		String qry="select * from empinfo.employee where empid=?";
		try 
		{
			Class.forName(fqcn);
			Connection con=DriverManager.getConnection(url);
			PreparedStatement pstmt=con.prepareStatement(qry);
			
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				String name=rs.getString(2);
				String role=rs.getString(3);
				String place=rs.getString(4);
				
				System.out.println(name+" "+role+" "+place);
			}
			else
			{
				System.out.println("Employee Not Found");
			}
			
		} 
		catch (Exception e) 
		{

			e.printStackTrace();
		}
		
	}
	
}
