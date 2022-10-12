package JavaPrograms;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(; ; )
		{
		int no=new Scanner(System.in).nextInt();
		if(no%3==0 && no%5==0)
		{
			System.out.println("HiHello");
		}
		else if(no%3==0)
		{
			System.out.println("Hii");
		}
		else
		{
			System.out.println("Bye");
		}

		}
	}

}
