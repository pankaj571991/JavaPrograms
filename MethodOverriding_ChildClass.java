package basicsprograms;
class Parent_class
{
	void login()
	{
		System.out.println("Login with email id");
	}
}
public class MethodOverriding_ChildClass extends Parent_class
{
	void login()
	{
		
		System.out.println("Login with mobile number");
		
	}
	public static void main(String[] args) 
	{
		MethodOverriding_ChildClass m1=new MethodOverriding_ChildClass();
		m1.login();
		
		
		
	}

}
