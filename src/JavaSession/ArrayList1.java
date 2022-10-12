package JavaSession;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("hii");
		list.add(null);
		list.add(null);
		list.add(true);
		System.out.println(list);
		list.add(2,"hello");  //adding value in 2nd index
		System.out.println(list);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(20);
		list1.add(5);
		list1.add(1);
		list1.add(30);
		Collections.sort(list1);   //It will sort the elements
		list.addAll(list1);
		System.out.println(list);
		if(list.contains("hii")) //It will search the value
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
		System.out.println(list.remove(2)); //It will remove the value
		
		for(Object obj: list) //It will iterate the element one by one
		{
			System.out.println(obj);
		}
	}

}
