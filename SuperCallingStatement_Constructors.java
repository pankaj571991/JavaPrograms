package basicsprograms;
class Reporting
{
	Reporting()
	{
		System.out.println("Reporting");
	}
}
class Sreenshot extends Reporting
{
	Sreenshot()
	{
		super();
		System.out.println("Sreenshot");
	}
}
public class SuperCallingStatement_Constructors extends Sreenshot
{
	
	SuperCallingStatement_Constructors()
	{
		super(); //implicitly and explicitly
		System.out.println("SuperCallingStatement_Constructors");
	}
	
	public static void main(String[] args) 
	{
		
		new SuperCallingStatement_Constructors();
		
	}
	
}
//Super Calling Statement