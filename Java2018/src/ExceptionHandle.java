
public class ExceptionHandle {
	
	public void m1()
	{
		int i=50;
		
	try {
		System.out.println(i/0);
		System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println("Please Conti...");
	}
	}

	public static void main(String[] args) {
		ExceptionHandle obj=new ExceptionHandle();
		obj.m1();

	}

}
