package StringPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveTheDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love banglore I love City";
		
		String[] s = str.split(" ");
		System.out.println(Arrays.toString(s));
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		{
			for (int i = 0; i < s.length; i++) 
			{
				set.add(s[i]);
			}
			
			 for (String s1 : set)
			 {
				 System.out.print(s1+" ");
			 }
		}

	}

}
