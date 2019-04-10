package SimpleJavaProg;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("Anand");
		hset.add("Mahesh");
		hset.add("Nikhil");
		hset.add("Anand");
		System.out.println(hset);
		System.out.println(hset.contains("Anand"));
		

	}

}
