package student;

public class StudentDaoFactory
{
	private static StudentDao stddao;
	{
		stddao=new StudentDaoImp();
	}
	public static StudentDao getStudentDaoObject()
	{
		return stddao;
	}
}