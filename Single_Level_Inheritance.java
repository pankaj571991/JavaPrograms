package basicsprograms;
class One //super class
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}
}
public class Single_Level_Inheritance extends One //sub class
{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args) 
	{
		
		
		mul();
		div();
		add();
		sub();
		
		
	}

}
