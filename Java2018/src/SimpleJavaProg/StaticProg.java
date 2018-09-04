package SimpleJavaProg;

public class StaticProg {
	
	int p=900;
	static int i=100;
	public void m1()
	{
		System.out.println(p);
		System.out.println(StaticProg.i);
	}
	
	public static void m2()
	{
		StaticProg obj=new StaticProg();
		System.out.println(obj.p);
		System.out.println(StaticProg.i);
		
	}
	public static void main(String[] args)
	{
		StaticProg obj=new StaticProg();
		obj.m1();
		StaticProg.m2();
	}

}
