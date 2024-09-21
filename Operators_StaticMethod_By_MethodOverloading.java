package basicsprograms;

public class Operators_StaticMethod_By_MethodOverloading 
{
//ASSIGNMENT 3 Done
	static void operstors(double a,double b)
	{
		double sum=a+b;
		System.out.println("Addition of two numbers is: "+sum);
	}
	static void operstors(int a, int b) 
	{
		int sub=a-b;
		System.out.println("Subtraction of two numbers is: "+sub);
	}
	static void operstors(int a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication of two numbers is: "+mul);
	}
	static void operstors(double a,int b)
	{
		double div=a/b;
		System.out.println("Division of two numbers is: "+div);
	}
	static void operstors(float a,int b)
	{
		double mod=a%b;
		System.out.println("Remainder of two numbers is: "+mod);
	}
	public static void main(String[] args) 
	{

		operstors(5.70,9.5);
		operstors(10,6);
		operstors(5,6.5);
		operstors(10.5,2);
		operstors(10.5f,2);
		
		
		
	}

}
