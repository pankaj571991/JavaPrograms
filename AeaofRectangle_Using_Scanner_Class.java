package basicsprograms;

import java.util.Scanner;

public class AeaofRectangle_Using_Scanner_Class 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of Length");
		double l=    s1.nextDouble();
		System.out.println("Enter the value of Breath");
		double b=   s1.nextDouble();
		
		
		double area=l*b;
		System.out.println("AeaofRectangle_Using_Scanner_Class is: "+area);
		
		s1.close();
		
	}

}
