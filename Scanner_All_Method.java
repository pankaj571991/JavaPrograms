package basicsprograms;

import java.util.Scanner;

public class Scanner_All_Method 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
    	System.out.println("Enter your name");
		String Firstname= s1.next();
		
		System.out.println("Are you Graduate?");
		boolean b1=s1.nextBoolean();
	
		
		//byte b2=s1.nextByte();
		
		s1.close();
	}

}
