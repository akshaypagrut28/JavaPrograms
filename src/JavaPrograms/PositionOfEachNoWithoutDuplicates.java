package JavaPrograms;

import java.util.LinkedHashSet;

public class PositionOfEachNoWithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,3,2,3,1,5,6,4,3};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		
		for(Integer no : set)
		{
			for(int i=0; i<a.length; i++) 
			{
			if(no==a[i])
			{
				System.out.println(no+" is present in "+(i+1)+" position");
				break;
			}
			}
		}

	}

}
