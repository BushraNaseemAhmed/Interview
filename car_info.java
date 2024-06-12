package car_wale_project;

import java.sql.*;

public class car_info {

	public static void main(String[] args) 
	{
		String fqcn="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=bushra@23";
		String qry="insert into carwala_info.car values(808,'Audi',56,2023)";
		String qry1="delete from carwala_info.car where cno=800; ";
		try 
		{
			Class.forName(fqcn);
			System.out.println("Step 1 done....");
			
			   Connection c=DriverManager.getConnection(url);
			   System.out.println("Step 2 done....");
			   
			   Statement stmt=c.createStatement();
			   System.out.println("Step 3 done.....");
			   
			   stmt.executeUpdate(qry);
			   stmt.executeUpdate(qry1);
			   
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
