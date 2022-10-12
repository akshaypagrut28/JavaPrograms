package StringPrograms;

public class PrintNoOfVowelsPresentInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "india";
		int count =0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				System.out.print(ch[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);

	}

}
