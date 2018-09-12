package SimpleJavaProg;

public class RemoveSplCharacter {

	public static void main(String[] args) {
	String s="Hello World @^#%@&#%@%!#%";
	
	s=s.replaceAll("[^a-zA-Z0-9]","");//Regular expression
	System.out.println(s);
	}

}
