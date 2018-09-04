package SimpleJavaProg;

public class ArrayProg {
	
	public static void main(String[] args) {
		//integer array
		int a[]= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		/*a[3]=40;*/ // interger out of bound array
		
		/*System.out.println(a.length);*/
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); // to display array values
		}	
		
		
		// object array with different datatypes. Using object array we can mention different datatypes.
		
		Object obj[]=new Object[5];
		obj[0]="Anand";
		obj[1]=465;
		obj[2]=true;
		obj[3]=10.55;
		System.out.println(obj.length);
		
		for(int j=0;j<obj.length;j++)
		{
			System.out.println(obj[j]);
		}

	}

}
