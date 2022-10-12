package StringPrograms;

public class FindMaxLengthInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"abcdef","avbc","vvn","bn","cvfghdjj"};
		String maxlength=s[0];
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()>maxlength.length())
			{
				maxlength=s[i];
			}
		}
		
		for(int i=0; i<s.length;i++)
		{
			if(s[i].length()==maxlength.length())
			{
				System.out.println(s[i]);
			}
		}

	}

}
