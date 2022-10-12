package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Tester";
		String s= str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
			//System.out.println(set);
		}
		for(Character ch : set)
		{
			System.out.print(ch);
		}

	}

}
