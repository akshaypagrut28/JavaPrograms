package JavaPrograms;

public class FirstMaxWithoutSorting {

	public static void main(String[] args) {
		
		int arr[] = {8,9,88,7,66,5};
		
		int fmax = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			
			if(arr[i] > fmax)
			{
				fmax = arr[i];
			}
			
		}

		System.out.println(" First maximum value is---->"+fmax);
	}

}
