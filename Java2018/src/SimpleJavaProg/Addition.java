package SimpleJavaProg;

public class Addition {

	public void add()
	{
		int i=100;
		int j=200;
		int k=i+j;
		System.out.println("Addition of k is ="+k);
	}
	
	public static void main(String[] args)
	{
		Addition obj=new Addition();
		obj.add();
		
	}

}
