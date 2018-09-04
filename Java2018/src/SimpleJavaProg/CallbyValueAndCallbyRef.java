package SimpleJavaProg;

public class CallbyValueAndCallbyRef {

	int ab;
	int bc;
	
	public void swap2(CallbyValueAndCallbyRef t)
	{
		int temp;
		temp=t.ab;
		t.ab=t.bc;
		t.bc=temp;
	
		
	}
	public int swap(int x, int y)
	{
		int a=10;
		int b=20;
		int p=x+y;
		return p;
		
	}
	
	public static void main(String[] args)
	{
		CallbyValueAndCallbyRef obj= new CallbyValueAndCallbyRef();
		int x=30;
		int y=50;
		obj.swap(x, y);
		obj.ab=20;
		obj.bc=25;
		obj.swap2(obj);
		System.out.println(obj.ab);
		System.out.println(obj.bc);
		
	}

}
