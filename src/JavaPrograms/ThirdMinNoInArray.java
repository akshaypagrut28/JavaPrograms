package JavaPrograms;

import java.util.Arrays;

public class ThirdMinNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,8,9,7,66,88,2};
		
		for(int i=0; i<a.length-1;i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-3]);

	}

}
