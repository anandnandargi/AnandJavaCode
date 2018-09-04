package SimpleJavaProg;

public class LocalVariable {
	
	public void localobj()
	{
		int i=100;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		LocalVariable obj=new LocalVariable();
		obj.localobj();
	
	}

}
