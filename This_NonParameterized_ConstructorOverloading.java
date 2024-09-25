package basicsprograms;

public class This_NonParameterized_ConstructorOverloading 
{
	This_NonParameterized_ConstructorOverloading()
	{
		this(45);
		System.out.println("1st");
	}
	This_NonParameterized_ConstructorOverloading(int a)
	{
		
		System.out.println("2nd");
	}
	
	public static void main(String[] args)
	{
		
		
		new This_NonParameterized_ConstructorOverloading();
		
	}
}
//this(); Calling Statement Non-Parameterized
