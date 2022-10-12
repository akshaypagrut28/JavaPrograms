package StringPrograms;

public class StringIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mom";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(s))
		{
			System.out.println("Is palindrome ");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
