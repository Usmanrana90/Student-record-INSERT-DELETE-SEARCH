package student;

public interface StudentService
{
	public String addStudent(String id,String name, String address);
	
	public String searchStudent(String stdname);
	public String updateStudent(String stdname);
	public String deleteStudent(String stdname);
}