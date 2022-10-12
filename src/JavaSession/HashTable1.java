package JavaSession;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String>  ht = new Hashtable<Integer, String>();
		ht.put(10, "hii");
		ht.put(20, "hello");
		ht.put(30, "bye");
		ht.put(20, "hii"); //duplicate key is not allowed
		ht.put(40, "hello"); //duplicates values are allowed
		//not allowed ht.put(null, "hii");
		//not allowed ht.put(40, null);
		System.out.println(ht);
		System.out.println(ht.remove(20));
		System.out.println(ht.size());
		System.out.println(ht.containsKey(40));
		System.out.println(ht.replace(40, "super"));
		System.out.println(ht.get(40));
		System.out.println(ht);

	}

}
