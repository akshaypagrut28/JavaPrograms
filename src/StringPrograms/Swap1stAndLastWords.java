package StringPrograms;

import java.util.Arrays;

public class Swap1stAndLastWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "I love Banglore city";
		String[] s = st.split(" ");
		System.out.println(Arrays.toString(s));
		String temp=s[0]; //temp=I;
		s[0]=s[s.length-1]; //s[0]=city
		s[s.length-1]=temp; //s[3]=I;
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}
		


	}

}
