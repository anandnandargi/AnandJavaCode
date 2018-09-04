package SimpleJavaProg;

public class Child extends ParentDemo {

	public void marry()
	{
		System.out.println("This is Child extended property of Parent");
	}
	
	public void m1()
	{
		System.out.println("Child m1 method");
	}
	
	public void c2()
	{
		System.out.println("Child c2 method");
	}
	
	
	public static void main(String[] args)
	{
		ParentDemo obj=new ParentDemo();
		ParentDemo obj2=new ParentDemo();
		obj.marry();
		obj2.m1();

	}

}
