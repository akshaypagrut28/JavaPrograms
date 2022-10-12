package StringPrograms;

public class AddtitionIntegerInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="11b21c3";
		String temp= "";
		int sum =0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else 
			{
			temp = temp+s.charAt(i);
			   sum=sum+tsum;
			   tsum=0;
			}
			
		}
		sum=sum+tsum;
		System.out.println(sum+" "+temp);

	}

}
