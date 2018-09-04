package SimpleJavaProg;

public class MainOverload {

	public static void main(String[] args) {
	
		System.out.println("Main method");
		main(10);
		main(20,'a');
	}

	
	public static void main(int a)
	{
		System.out.println("Main Integer method");
	}
	
	public static void main(int a, char b)
	{
		System.out.println("Main Char Method");
	}
}
