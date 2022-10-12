package JavaPrograms;

import java.util.Arrays;

public class RemoveDuplicateInAnArray 

{

	public static void main(String[] args) 
	{
		int[] a= {4,3,2,4,6,5,7,5};
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]>=a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		
		}
		int j=0;
		int length = a.length;
		int b[]=new int[length];
		for(int i=0; i<a.length-1; i++)
		{
		   if(a[i]!=a[i+1])
		   {
			   b[j]=a[i];
			   j++;
			   
		   }  
		   b[j] = a[a.length-1];
		}
		System.out.println(Arrays.toString(b));
		for(int no : b)
		{
			System.out.print(no + " ");
		}
	}

}
