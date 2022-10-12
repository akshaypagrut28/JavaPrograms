package StringPrograms;

public class FindMinLengthInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] s= {"abcdef","avbc","vvn","bn","cvfghdjj"};
		String[] s= {"15261261276","163576","65768","57457474","5655","9234"};
		String minlength=s[0];
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()<minlength.length())
			{
			minlength=s[i];
			}
		
		}
		
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==minlength.length())
			{
				System.out.println(s[i]);
			}
		}
		
	}

}
