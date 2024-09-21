package basicsprograms;

public class NonStaticMethod 
{

	void addition()
	{
		System.out.println("Adding two numbers");
	}
	void subtraction()
	{
		System.out.println("subtracting two numbers");
	}
	public static void main(String[] args) 
	{

		System.out.println("My main Method");
		NonStaticMethod n1=new NonStaticMethod();
		n1.addition();
		n1.subtraction();
	}

}
