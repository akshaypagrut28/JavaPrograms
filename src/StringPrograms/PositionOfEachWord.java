package StringPrograms;

public class PositionOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love Banglore I love city";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			
			System.out.println(s1[i]+" is present in "+(i+1)+" position");
			
		}


	}

}
