package StringPrograms;

public class ReverseTheWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "I love Banglore city";
		String[] str = st.split(" ");
		for(int i=0 ; i<str.length; i++)
		{
			String s= str[i];
			for (int j=s.length()-1; j>=0; j--)
			{
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}


	}

}
