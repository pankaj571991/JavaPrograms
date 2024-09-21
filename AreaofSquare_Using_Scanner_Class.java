package basicsprograms;

import java.util.Scanner;

public class AreaofSquare_Using_Scanner_Class 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of Area of Square a");
		double a=   s1.nextDouble();
		
		double area=a*a;
		System.out.println("AreaofSquare_Using_Scanner_Class is: "+area);
		
		s1.close();
		
	}

}
