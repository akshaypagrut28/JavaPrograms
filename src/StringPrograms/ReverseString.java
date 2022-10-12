package StringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "welcome";
		char[] s1=s.toCharArray();
		for(int i=s.length()-1;i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		for(int i=s1.length-1; i>=0; i--)
		{
			System.out.println(s1[i]);
		}

		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
		   rev = rev+rev.charAt(i);
		}
		System.out.println(rev);
		int count = 0;
		for(char c : s1)
		{
			count++;
		}
		
		for(int i=count-1; i>=0; i--)
		{
			System.out.println(s1[i]);
		}
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
