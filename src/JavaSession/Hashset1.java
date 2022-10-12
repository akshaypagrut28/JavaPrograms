package JavaSession;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Object>  hs = new HashSet<Object>();
		hs.add(20);
		hs.add(null);
		hs.add(null);
		hs.add(20);
		hs.add("hii");
		hs.add(true);
		hs.add("hello");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(20));
		System.out.println(hs.size());
		if(hs.contains("hi"))
		{
			System.out.println("Present");
		}
		else
		{
		   System.out.println("not present");	
		}	
			
		for(Object obj : hs)  //using for-each loop fetching data
		{
			System.out.println(obj);
		}
		System.out.println();
		
		Iterator<Object>  i = hs.iterator();  //using iterator fetching data	
		while(i.hasNext())	
		{
			System.out.println(i.next());
		}

	}

}
