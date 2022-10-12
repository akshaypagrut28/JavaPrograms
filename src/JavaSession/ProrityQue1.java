package JavaSession;

import java.util.PriorityQueue;

public class ProrityQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Object> que = new PriorityQueue<Object>();
		que.add("hii");
		que.add("hello");
		que.add("bye");
		que.add("good bye");
		
		System.out.println(que.peek());  //will fetch not remove
		System.out.println(que);
		System.out.println(que.poll()); //will fetch nd remove
		System.out.println(que);

	}

}
