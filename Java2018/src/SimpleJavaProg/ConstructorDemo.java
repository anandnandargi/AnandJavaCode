package SimpleJavaProg;

public class ConstructorDemo {

	
	public ConstructorDemo()
	{
		System.out.println("This is First Const");		
	}
	
	public ConstructorDemo(int i, int k)
	{
		int j=i+k;
		System.out.println("Addition of j is ="+j);
	}
	public static void main(String[] args)
	{
		ConstructorDemo obj=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo(100, 200);
	}

}
