package JavaSession;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Object> st = new Stack<Object>();
		st.push(20);
		st.push(40);
		st.push(50);  //Last In
		System.out.println(st);
		System.out.println(st.pop()); //First Out
		System.out.println(st.pop());

	}

}
