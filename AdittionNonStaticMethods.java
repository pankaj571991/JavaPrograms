package basicsprograms;

public class AdittionNonStaticMethods 
{

	void addition()
	{
		int a=100;
		int b=2000;
		int sum=a+b;
		System.out.println("The addition of two numbers is: "+sum);
		
	}
	void subtraction()
	{
		int a=100;
		int b=2000;
		int sub=b-a;
		System.out.println("The subtraction of two numbers is: "+sub);
		
	}
	void multiplication()
	{
		int a=100;
		int b=20;
		int multi=b*a;
		System.out.println("The multiplication of two numbers is: "+multi);
		
	}
	void divide()
	{
		int a=100;
		int b=20;
		int div=a/b;
		System.out.println("The division of two numbers is: "+div);
		
	}
	void modulus()
	{
		int a=102;
		int b=20;
		int mod=a%b;
		System.out.println("The reminder of two numbers is: "+mod);
		
	}
	public static void main(String[] args) 
	{

		AdittionNonStaticMethods a1=new AdittionNonStaticMethods();
		a1.addition();
		a1.subtraction();
		a1.multiplication();
		a1.divide();
		a1.modulus();
		
	}


}
