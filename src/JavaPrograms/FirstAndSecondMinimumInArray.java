package JavaPrograms;

import java.util.Arrays;

public class FirstAndSecondMinimumInArray {

	public static void main(String[] args) {
		
		int a[] ={3,55,7,77,88,99,9,8,6};
		
		int fmin = a[0];
		int smin = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] <= fmin)
			{
				if(a[i]!=fmin)
				{
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(fmin==smin || a[i] < smin)
			{
				smin = a[i];
			}
		}
		
		System.out.println("/n Given Array is -->"+Arrays.toString(a));
		System.out.println("First minimum value is-->"+fmin);
		System.out.println("Second minimum value is-->"+smin);

	}

}
