package student;

import java.sql.*;
public class StudentServiceImp implements StudentService
{
	public String addStudent(String id,String name,String address)
	{
		StudentDaoImp std=(StudentDaoImp) StudentDaoFactory.getStudentDaoObject();
		String status=std.addStudent(id,name,address);
		return status;
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