package student;

import java.sql.*;

public class StudentDaoImp implements StudentDao
{
	public String addStudent(String id,String name,String address)
	{	
	try
	{	
		String status="false";
		Connection con=StudentConnection.getStudentConnection();
		Statement st=con.createStatement();
		int i=st.executeUpdate("insert into school values('"+id+"','"+name+"','"+address+"')");
		if(i>0)
		{
			status="true";
		}
		return status;
		
	}
	catch(Exception e)
	{
		
	}
		
	}
	public String searchStudent(String id)
	{
		return null;
	}
	public String updateStudent(String stdname)
	{
		return null;
	}
	public String deleteStudent(String stdname)
	{
		return null;
	}
	
}
