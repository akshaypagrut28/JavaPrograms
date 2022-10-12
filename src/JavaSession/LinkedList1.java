package JavaSession;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> ll = new java.util.LinkedList<Object>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("hii");
		ll.add(null);
		ll.add(true);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(3));
		System.out.println(ll.removeFirst());
		System.out.println(ll.remove(2));
		System.out.println(ll.removeLast());
		System.out.println(ll.removeLastOccurrence(true));
		
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add("hii");
		list.add("hello");
		list.add(50);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(ll);
		System.out.println(ll.retainAll(list)); //Show the duplicates present in ll w.r.t list
		System.out.println(ll);
		ll.removeAll(list);
		System.out.println(ll);
		ll.addAll(list);
		for (Object obj : ll)
		{
			System.out.println(obj);
		}

	}

}
