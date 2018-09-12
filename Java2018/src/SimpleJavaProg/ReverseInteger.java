package SimpleJavaProg;

public class ReverseInteger {

	public static void main(String[] args) {
		int i=12345;
		int rev=0;
		while(i!=0)
		{
			rev=rev*10+i%10;
			i=i/10;
		}
System.out.println(rev);


int num=12345;
System.out.println(new StringBuffer(String.valueOf(num)).reverse());

	}

}
