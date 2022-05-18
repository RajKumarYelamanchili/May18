package javaprograms;

import java.util.Scanner;

class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check if Prime or not?");
		int num = sc.nextInt();
		int count =0;
		
		if(num >1)
		{
			for(int i=1; i <=num; i++)
			{
				if(num%i ==0)
					count++;
			}
			if (count ==2)
			{System.out.println("Number is Prime");}
			else
			{
				System.out.println("Number is not a prime");
			}
		}

	}

}
