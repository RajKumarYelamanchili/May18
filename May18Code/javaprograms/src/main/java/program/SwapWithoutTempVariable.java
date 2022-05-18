package program;

public class SwapWithoutTempVariable {

	public static void main(String[] args) {
		int a=3;
		int b=2;
	
		 System.out.println("Before swapping ");
		 System.out.println("a= " + a + "   " +"b= " +b);
		 
		a=  a*b;
		b  = a/b;
		a= a/b;
		
		System.out.println("After swapping ");
		 System.out.println("a= " + a + "   " +"b= " +b);
	}

}
