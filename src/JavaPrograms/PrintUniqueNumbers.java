package JavaPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueNumbers {

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
			System.out.println(no);
		}
	}

}
