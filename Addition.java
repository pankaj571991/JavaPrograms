package basicsprograms;

public class Addition 
{

	static void addition()
	{
		int a=100;
		int b=2000;
		int sum=a+b;
		System.out.println("The addition of two numbers is: "+sum);
			
	}
	
	static void subtraction()
	{
		int a=100;
		int b=2000;
		int sub=b-a;
		System.out.println("The subtraction of two numbers is: "+sub);
		
	}
	static void multiplication()
	{
		int a=100;
		int b=20;
		int multi=b*a;
		System.out.println("The multiplication of two numbers is: "+multi);
		
	}
	static void divide()
	{
		int a=100;
		int b=20;
		int div=a/b;
		System.out.println("The division of two numbers is: "+div);
		
	}
	static void modulus()
	{
		int a=102;
		int b=20;
		int mod=a%b;
		System.out.println("The reminder of two numbers is: "+mod);
		
	}
	public static void main(String[] args) 
	{

		addition();
		subtraction();
		multiplication();
		divide();
		modulus();
		
	}

}
