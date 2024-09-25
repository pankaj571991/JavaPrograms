package basicsprograms;

public class This_Parameterized_ConstructorOverloading 
{

	This_Parameterized_ConstructorOverloading()
	{
		this(10);
		System.out.println("1st");
	}
	This_Parameterized_ConstructorOverloading(int a)
	{
		this(10,20);
		System.out.println("2nd");
	}
	This_Parameterized_ConstructorOverloading(int a,int b)
	{
		this(100,"Amit");
		System.out.println("3rd");
	}
	This_Parameterized_ConstructorOverloading(int a,String b)
	{
		
		System.out.println("4th");
	}
	public static void main(String[] args)
	{
		
		
		new This_Parameterized_ConstructorOverloading();
		
	}

}
