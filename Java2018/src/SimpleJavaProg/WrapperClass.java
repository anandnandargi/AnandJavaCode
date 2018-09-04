package SimpleJavaProg;

public class WrapperClass {

	
	
	public static void main(String[] args) 
	{
		String s="100"; 	// From string to integer
		int i=Integer.parseInt(s);
		System.out.println(i+20);
	
	
		String a="12.15"; 	// From string to double
		double d=Double.parseDouble(a);
		System.out.println(d+20);
		
		
		String b="true"; // From String to Boolean
		boolean n=Boolean.parseBoolean(b);
		System.out.println(n);
		
		int j=200; 		// From int to String
		String k=String.valueOf(j+20);
		System.out.println(k);
		
		
		String ab="100na"; 			// invalid number format exception
		int abc=Integer.parseInt(ab);
		System.out.println(abc);
		
	}
	
	

}
