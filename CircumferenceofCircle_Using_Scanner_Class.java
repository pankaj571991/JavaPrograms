package basicsprograms;

import java.util.Scanner;

public class CircumferenceofCircle_Using_Scanner_Class 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of PI");
		double pi=   s1.nextDouble();
		System.out.println("Enter the value of radius");
		double r=    s1.nextDouble();
		
		double circumference=2*pi*r;
		System.out.println("CircumferenceofCircle_Using_Scanner_Class is: "+circumference);
		
		s1.close();
		
	}

}
