package JavaSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer>   set = new TreeSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(3);
		set.add(8);
		set.add(40);
		set.add(50);
		System.out.println(set);
		ArrayList<Object>  list = new ArrayList<Object>(set);
		list.add("hii");
		list.add("hello");
		list.add(50);
		list.add("bye");
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(list.remove(3));
		System.out.println(list.set(3, "hiihello"));
		System.out.println(set.descendingSet());
		System.out.println();
		
		Iterator<Object> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
