package basicsprograms;

public class StaticAndNonStatic 
{

	static void addition()
	{
		System.out.println("Addition");
	}
	void subtraction()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{


		addition();
		StaticAndNonStatic s1=new StaticAndNonStatic();
		s1.subtraction();
		
	}

}
