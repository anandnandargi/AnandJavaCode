package SimpleJavaProg;

public class TwoDArrayProg {

	public static void main(String[] args) {
		
		int a[][]= new int[3][3]; // its 3 row and 3 column array. Array Declaration
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		
		System.out.println(a.length);
		
		for(int row=0;row<a.length;row++)
		{
			for(int col=0;col<a.length;col++)
				System.out.println(a[row][col]);
		}
	}

}
