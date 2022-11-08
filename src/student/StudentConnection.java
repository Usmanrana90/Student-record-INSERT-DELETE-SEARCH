package student;

import java.sql.*;

public class StudentConnection
{
	private static Connection  con;
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch(Exception e)
		{
			
		}
			
	}
	public static Connection getStudentConnection()
	{
		
			try
			{
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
				return con;
			}
			catch(Exception e)
			{
				
			}
		
		
	}
	
	
}