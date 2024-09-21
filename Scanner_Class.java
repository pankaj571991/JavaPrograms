package basicsprograms;

import java.util.Scanner;

public class Scanner_Class 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=     s1.nextInt();
		System.out.println("Enter the value of b");
		int b=     s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of two numbers is: "+sum);
		
		s1.close();
		
	}

}
