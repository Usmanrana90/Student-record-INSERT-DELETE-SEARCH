package student;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.Enumeration;
import java.sql.*;

@WebServlet(urlPatterns=("/student"))
public class StudentServlet extends HttpServlet
{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		doStudentProcess(req,resp);
		
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		doStudentProcess(req,resp);
		
	}
	public void doStudentProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		RequestDispatcher rd=null;
		String requri=req.getRequestURI();
		System.out.println("Hello");
		if(requri.endsWith("addForm"))
		{
			
			String id=req.getParameter("sid");
			String name=req.getParameter("sname");
			String address=req.getParameter("address");
			
			StudentServiceImp std=(StudentServiceImp) StudentServiceFactory.getStudentServiceObject();
			String status=std.addStudent(id,name,address);
			if(status.equals("true"))
			{
				rd=req.getRequestDispatcher("./success.html");
				rd.forward(req,resp);
			}
		}
		
		if(requri.endsWith("search"))
		{
			rd=req.getRequestDispatcher("/search.html");
			rd.forward(req,resp);
		}
		
		if(requri.endsWith("update"))
		{
			rd=req.getRequestDispatcher("/update.html");
			rd.forward(req,resp);
		}
		
		if(requri.endsWith("delete"))
		{
			rd=req.getRequestDispatcher("/delete.html");
			rd.forward(req,resp);
		}
		
	}
	
}