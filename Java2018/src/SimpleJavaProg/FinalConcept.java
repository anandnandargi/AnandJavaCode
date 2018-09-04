package SimpleJavaProg;

public class FinalConcept {

	public static void main(String[] args) {

		FinalConcept obj=new FinalConcept();
		obj.f1();
	}

	final int i=10;
	
	public void f1()
	{
		final int i=20;
		System.out.println(i);
	}
}
