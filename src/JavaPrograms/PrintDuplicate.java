package JavaPrograms;

import java.util.LinkedHashSet;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,2,3,1};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		
		for(Integer no : set)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(no==(a[i]))
				{
					//System.out.println(a[i]);
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println(no+" is repeating "+count+" times");
			}
			
		}

	}

}
