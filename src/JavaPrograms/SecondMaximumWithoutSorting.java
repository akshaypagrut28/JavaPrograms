package JavaPrograms;

public class SecondMaximumWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,8,99,77,6,5,9,99};
		
		int fmax = arr[0]; //4
		
		int smax = arr[0]; //4
		
		for (int i = 1; i < arr.length-1; i++) 
		{
			if(arr[i]>=fmax)  //4>=4//8>=4//99>=8//77>=99//6>=99
			{
				if(arr[i]!=fmax) //4!=4//8!=4//99!=8
				{
					smax=fmax; //smax=8
				}
				fmax=arr[i]; //fmax=4//8//99
			}
			else if(fmax==smax || arr[i]> smax)//77==8 || 77>8// 77==99 || 6 >77 
			{
				smax = arr[i]; //smax==77
			}
			
		}
		System.out.println("First max value-->"+fmax);
		System.out.println("Second max value-->"+smax);

	}

}
