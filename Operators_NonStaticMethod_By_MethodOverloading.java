package basicsprograms;

public class Operators_NonStaticMethod_By_MethodOverloading 
{
	//ASSIGNMENT 4 Done
	void operstors(double a,double b)
	{
		double sum=a+b;
		System.out.println("Addition of two numbers is: "+sum);
	}
	void operstors(int a, int b) 
	{
		int sub=a-b;
		System.out.println("Subtraction of two numbers is: "+sub);
	}
	void operstors(int a,double b)
	{
		double mul=a*b;
		System.out.println("Multiplication of two numbers is: "+mul);
	}
	void operstors(double a,int b)
	{
		double div=a/b;
		System.out.println("Division of two numbers is: "+div);
	}
	void operstors(float a,int b)
	{
		double mod=a%b;
		System.out.println("Remainder of two numbers is: "+mod);
	}
	public static void main(String[] args) 
	{

		Operators_NonStaticMethod_By_MethodOverloading O1=new Operators_NonStaticMethod_By_MethodOverloading();
		
		O1.operstors(5.70,9.5);
		O1.operstors(10,6);
		O1.operstors(5,6.5);
		O1.operstors(10.5,2);
		O1.operstors(10.5f,2);
		
		
		
	}

}
