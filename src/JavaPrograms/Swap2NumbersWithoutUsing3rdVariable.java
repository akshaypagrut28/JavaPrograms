package JavaPrograms;

public class Swap2NumbersWithoutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20 ;
		
		int b = 10 ;
		
		System.out.println("Before swap --> the value of A is "+a+" the value of b is "+b);
		
		a = a + b ; 
		
		b = a - b ;
		
		a = a - b ;
		
		System.out.println("After swap --> the value of A is "+a+" the value of b is "+b);

	}

}
