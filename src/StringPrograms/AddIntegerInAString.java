package StringPrograms;

public class AddIntegerInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="b2c3d1";
		int no=0;
		String s1=" ";
		for (int i =0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				no=no+s.charAt(i)-48;
				
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(no+" "+s1);
		

	}

}
