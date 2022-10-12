package JavaPrograms;

import java.util.Arrays;

public class SortingElementInAscendingOrder {

	public static void main(String[] args) {
		
		int[] arr = {8,3,32,4,7,88,6};

		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i ; j < arr.length; j++) {
				
				if (arr[i] > arr[j])
				{
					int temp = arr [i];
					
					arr[i] = arr [j] ;
					
					arr [j] = temp ;
				}
				
			}
		}
		
          /*for (int i = 0; i < arr.length; i++) {
				
				System.out.print(arr[i] + " ");
				
			}*/
		System.out.println(Arrays.toString(arr));
		for (int no : arr)
		{
			System.out.print(no + " ");
		}
          System.out.println();
			
          System.out.println("First maximum Element "+arr[arr.length-1]);
			
			System.out.println("First Minimum Element "+ arr[0]);
			
			 System.out.println("Second maximum Element "+arr[arr.length-2]);
			 
			 System.out.println("Second Minimum Element "+ arr[1]);
			 
			 int sum = 0 ;
			 
			 for (int i = 0; i < arr.length; i++) {
				
				 sum = sum + arr[i];
			}
				System.out.println(sum);
	}

}
