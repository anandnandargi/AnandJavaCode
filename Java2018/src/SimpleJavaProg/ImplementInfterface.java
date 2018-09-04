package SimpleJavaProg;

public class ImplementInfterface implements Interfacedemo
{

	

	public static void main(String[] args)
	{
		ImplementInfterface obj=new ImplementInfterface();
		obj.m1();
	
		
	}


	@Override
	public void m1() {
		
		System.out.println("Hello");
		
		
	}


	@Override
	public void m1(int i) {
		i=100;
		
	}

}
