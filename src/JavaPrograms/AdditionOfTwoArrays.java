package JavaPrograms;

public class AdditionOfTwoArrays {

	public static void main(String[] args) 
	{
		
		int[] a= {2,2,3,5,6,2};
		int[] b= {2,3,5,1,5};
		int length = a.length; //6
		if(a.length<b.length)  //6<5
		{
			length=b.length;
		}
		
		for(int i=0; i<length; i++) //i=0
		{
			try 
			{
			   System.out.println(a[i]+b[i]); //2+2
			} 
			catch (Exception e) 
			{
			    if(a.length<b.length)
			    {
			    	System.out.println(b[i]);
			    }
			    else
			    {
			    	System.out.println(a[i]);
			    }
			}
		}
		
   }

	

}
