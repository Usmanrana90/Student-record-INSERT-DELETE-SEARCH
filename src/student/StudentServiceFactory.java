package student;

public class StudentServiceFactory
{
	private static StudentService stdser;
	
	static
	{
		stdser=new StudentServiceImp();
	}
	public static StudentService getStudentServiceObject()
	{
		return stdser;
	}
}