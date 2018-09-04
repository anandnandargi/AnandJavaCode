package SimpleJavaProg;

public class StudentStaticdemo {

	static String CollegeName="HNCC";
	int studentid;
	String studentname;
	
	public void student()
	{
		studentid=101;
		studentname="Aakash";
		/*System.out.println(StudentStaticdemo.CollegeName);
		System.out.println("Student ID="+studentid);
		System.out.println("Name="+studentname);*/
	}
	
public static void details()
	{
		StudentStaticdemo obj=new StudentStaticdemo();
		System.out.println(obj.studentid);
		System.out.println(obj.studentname);
	}
	public static void main(String[] args)
{
		StudentStaticdemo obj= new StudentStaticdemo();
		obj.student();
		System.out.println(obj.studentid);
		System.out.println(obj.studentname);
	}

}
