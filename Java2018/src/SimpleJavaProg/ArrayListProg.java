package SimpleJavaProg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

	public static <E> void main(String[] args) {
	ArrayList arr= new ArrayList();
	arr.add("100");
	arr.add("200");
	arr.add("300");
	
	System.out.println(arr.size());

	
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i));
	}
	
	System.out.println("**************************");
	
	ArrayList<Integer> obj= new ArrayList<Integer>();
	obj.add(100);
	obj.add(200);
	obj.add(200);
	
	System.out.println(obj.size());
	
	
	Iterator itr=obj.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}
}
