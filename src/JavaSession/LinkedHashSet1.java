package JavaSession;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(20);
		lhs.add(40);
		lhs.add(20);
		lhs.add(50);
		lhs.add(60);
		lhs.add(null);
		lhs.add(null);
		lhs.add("hii");
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.remove(null));
		System.out.println(lhs.size());
		

	}

}
