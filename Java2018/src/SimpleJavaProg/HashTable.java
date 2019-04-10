package SimpleJavaProg;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> htable=new Hashtable<Integer, String>();
		htable.put(1, "Anand");
		htable.put(1, "Anand");
		htable.put(2, "Nikhil");
		htable.put(3, "Mahesh");
		
		System.out.println(htable.get(1));
		
		for(Map.Entry ht: htable.entrySet())
		{
			System.out.println(ht);
		}
	}

}
