package JavaSession;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(10, "hii");
		hp.put(20, "hello");
		hp.put(30, "bye");
		hp.put(20, "hii"); //duplicate key is not allowed
		hp.put(40, "hello"); //duplicates values are allowed
		hp.put(null, "hii"); //one null key allowed
		hp.put(40, null);  //allowed
		hp.put(50, null); //allowed
		System.out.println(hp);
		System.out.println(hp.remove(20));
		System.out.println(hp.size());
		System.out.println(hp.containsKey(40));
		System.out.println(hp.replace(40, "super"));
		System.out.println(hp.get(40));
		System.out.println(hp);
		
		for(Entry<Integer, String> m : hp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());

	    }


	}

}
