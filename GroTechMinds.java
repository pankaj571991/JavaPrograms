package abstractclasses;
abstract class Google_Auth
{
	abstract void login(); //abstract methods
	abstract void registration(); //abstract methods
	
}
public class GroTechMinds extends Google_Auth
{
	void login() //concrete methods
	{
		System.out.println("Login of concrete method");
	}

	void registration() //concrete methods
	{
		System.out.println("Rgistration of concrete method");
	}
	public static void main(String[] args)
	{
		GroTechMinds g1=new GroTechMinds();
		g1.login();
		g1.registration();
	}
	
	
}
