package JavaPrograms;

import java.util.Arrays;

public class Seperate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,4,1,1,0,0,1,0}; 
		int[] temp = new int[arr.length];
		int m = 0, n =arr.length-1 ; 
		 for (int i = 0; i < arr.length; i++) 
		 {
			if(arr[i]==0)
			//if(arr[i]!=0)
			{
				temp[m]=0;
				//temp[m]=arr[i];
				m++;
			}
			//else if(arr[i]!=0)
				else
			{
				temp[n]=1;
				//temp[n]=arr[i];
				n--;
			}
			
		 }
		 System.out.println(Arrays.toString(temp));
		for (int i = 0; i < temp.length; i++) 
		{
			
			System.out.print(temp[i]+" ");
		}

	}

}
