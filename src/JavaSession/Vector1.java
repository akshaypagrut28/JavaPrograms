package JavaSession;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> vector = new Vector<Object>();
		vector.add(10);
		vector.add(30);
		vector.add(null);
		vector.add(null);
		vector.add(true);
		System.out.println(vector);
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		System.out.println(vector.capacity());
		System.out.println(vector.indexOf(30));
		vector.add(2,"hello");
		System.out.println(vector);

	}

}
