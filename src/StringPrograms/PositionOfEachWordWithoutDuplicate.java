package StringPrograms;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I love Banglore I love city";
		String[] s1 = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < s1.length; i++) 
		{
			
			set.add(s1[i]);
		}
		
		for (String str : set)
		{
			for(int i=s1.length-1; i>=0; i--)
			//for (int i = 0; i < s1.length; i++) 
			{
				if(str.equals(s1[i]))
				{
				System.out.println(s1[i]+" is present in "+(i+1)+" position");
				break;
				}
			}
		}

	}

}
