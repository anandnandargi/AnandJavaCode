package SimpleJavaProg;

public class MethodDeclaration {

	public static void main(String[] args)
	{
		MethodDeclaration obj=new MethodDeclaration();
		System.out.println(obj.add());
		obj.mul();

	}

	public int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		/*System.out.println(c);*/
	}
	
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		
		System.out.println(c);
	}
	

}
