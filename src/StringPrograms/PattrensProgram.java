package StringPrograms;

public class PattrensProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; 
		for (int i =n; i>0 ; i--) 
		{
			//for (int j=1; j<=n; j++)
			for(int j=n; j>0; j--)
			{
				//if(i<=j)
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}

	}

}
