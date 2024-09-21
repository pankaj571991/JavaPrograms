package basicsprograms;

import java.util.Scanner;

public class AreaofTriangle_Using_Scanner_Class 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of Breath");
		double b=   s1.nextDouble();
		System.out.println("Enter the value of Height");
		double h=    s1.nextDouble();
		
		double area=0.5*b*h;
		System.out.println("AreaofTriangle_Using_Scanner_Class is: "+area);
		
		s1.close();
		
	}

}
