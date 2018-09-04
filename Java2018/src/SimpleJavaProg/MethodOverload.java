package SimpleJavaProg;

public class MethodOverload {

	public MethodOverload()
	{
		System.out.println("This is Firstload");
	}
	
	public MethodOverload(int i)
	{
		System.out.println("The Value of i is="+i);
	}
	
	public MethodOverload(int i, int j)
	
	{
		System.out.println(i*j);
		
	}
	
	
	public static void main(String[] args)
	{
		MethodOverload obj=new MethodOverload();
		MethodOverload obj1=new MethodOverload(100);
		MethodOverload obj2=new MethodOverload(15,20);
		
		
	}

}
