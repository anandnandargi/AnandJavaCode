package SimpleJavaProg;

public class StringReverseForLoop {

	public static void main(String[] args) {
		String headline= "Demo Example of String reverse";
		StringBuilder input= new StringBuilder();
		input.append(headline);
		input=input.reverse();
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i));
		}
	}

}
