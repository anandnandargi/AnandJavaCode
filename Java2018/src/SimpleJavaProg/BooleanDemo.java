package SimpleJavaProg;

public class BooleanDemo {

	public static void main(String[] args)
	{
		boolean b1= true;
		if((b1== true)||place(true))
		{
			System.out.println("B");
		}
	}
public static boolean place(boolean location)
{
	if (location==true)
	{
		System.out.println("V");
	}
	System.out.println("A");
	return true;
}

}
