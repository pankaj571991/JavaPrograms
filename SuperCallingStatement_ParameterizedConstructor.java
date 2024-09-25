package basicsprograms;
class Tom
{
	Tom(String a)
	{
		System.out.println("Tom");
	}
}
class Harry extends Tom
{
	Harry(int a,int b)
	{
		super("Pankaj");
		System.out.println("Harry");
	}
}
public class SuperCallingStatement_ParameterizedConstructor extends Harry
{
	
	SuperCallingStatement_ParameterizedConstructor()
	{
		super(10,20); //implicitly and explicitly
		System.out.println("SuperCallingStatement_ParameterizedConstructor");
	}
	
	public static void main(String[] args) 
	{
		
		new SuperCallingStatement_ParameterizedConstructor();
		
	}
	
	
	
}
//Super Calling Statement Parameterized