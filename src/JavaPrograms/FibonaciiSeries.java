package JavaPrograms;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" ");
		System.out.print(fib2+" ");
		for(int i=0;i<=10; i++)
		{
			
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}	

	}

}
