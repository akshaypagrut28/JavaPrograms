package StringPrograms;

import java.util.LinkedHashSet;

public class PrintOfVowelsInStringWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "india";
        
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) 
		{
			set.add(ch[i]);
		}
		int count =0;
		for (Character ch1 : set)
		{
			if(ch1=='a' || ch1=='i' || ch1=='e' ||ch1=='o' ||ch1=='u')
			{
				System.out.print(ch1+" ");
				count++;
			}
		}
		System.out.println(count);

	}

}
