package JavaPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfEachNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,3,4,3,5,4,6};
        
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
        	if(no==a[i])
        		count++;
        	}
        	
        	System.out.println(no+" is repeating "+count+" times");
        }

	}

}
