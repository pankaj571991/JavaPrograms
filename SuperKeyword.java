package basicsprograms;
class Parent_class1
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
public class SuperKeyword extends Parent_class1
{
	void login()
	{
		
		System.out.println("Login with mobile number");
		super.login();
	
	}
	public static void main(String[] args) 
	{
		SuperKeyword s1=new SuperKeyword();
		s1.login();
	}

}
