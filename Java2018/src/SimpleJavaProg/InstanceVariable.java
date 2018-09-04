package SimpleJavaProg;

public class InstanceVariable {

	int i=100;
	
	public void m1()
	{
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		InstanceVariable obj=new InstanceVariable();
		System.out.println(obj.i);
	}

}
