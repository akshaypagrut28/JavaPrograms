package JavaPrograms;

public class ThirdMinNoWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,8,88,77,66,7,9};
		
		int fmin=a[0];
		int smin=a[0];
		int tmin=a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<=fmin)
			{
			  if(a[i]!=fmin)
			  {
				  smin=fmin; 
			  }
			  fmin=a[i];
			}
			else if(a[i]<=smin)
			{
				if(a[i]!=smin)
				{
			    if(a[i]<smin || fmin==smin)
			    {
			    	tmin=smin;
			    }
			    smin=a[i];;
				}
			}
			else if(smin==tmin || a[i]<tmin)
			{
				tmin=a[i];
			}
			
		}
		System.out.println("Third Minimum Number is--->"+tmin);

	}

}
