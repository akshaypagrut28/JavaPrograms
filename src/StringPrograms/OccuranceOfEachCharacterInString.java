package StringPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "tester";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
			//System.out.println(set);
		}
		
		for(Character ch : set)
		{
			int count = 0;
			for(int i=0; i<s.length(); i++)
			{
				//System.out.println(s.charAt(i));
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count+" times");
			
		
		}

	}

}
