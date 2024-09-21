package basicsprograms;

import java.util.Scanner;

public class If_Else_Condition 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int ageofperson= s1.nextInt();
		
		
		if(ageofperson>=18)
		{
			System.out.println("You are Eligible to vote");
		}
		else
		{
			System.out.println("You are not Eligible to vote");
		}
		
		
		s1.close();
	}

}
