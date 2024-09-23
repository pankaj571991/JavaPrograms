package basicsprograms;
class Parent //super class
{
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
public class SingleInheritance_NonStaticMethods extends Parent
{
	
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
	
	public static void main(String[] args) 
	{
		SingleInheritance_NonStaticMethods s1=new SingleInheritance_NonStaticMethods();
		
		s1.mul();
		s1.div();
		s1.add();
		s1.sub();
		
		
	}

}
