package SimpleJavaProg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	
		hmap.put(1, "Anand"); // Duplicate key and value
		hmap.put(3, "Shridhar");
		hmap.put(4, "Mahesh");
		System.out.println(hmap.get(1)); // Displaying single key value
		
		for (Map.Entry m:hmap.entrySet()) // Displaying all key values
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		hmap.remove(3); //Removing key 2 and displaying
		
		System.out.println("After removing key 2:"+hmap);
		hmap.replace(1, "Maddy"); // Replacing using
		System.out.println(hmap);
		hmap.replace(3, "Shridhar", "nikhil"); // Replacing with key, old and new value
		System.out.println(hmap);
		
	}

}
