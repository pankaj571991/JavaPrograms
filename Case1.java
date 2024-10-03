package abstractclasses;

public class Case1
{
	public void add()
	{
		System.out.println("Add");
	}
	private void sub()
	{
		System.out.println("sub");
	}
	void mul()
	{
		System.out.println("mul");
	}
	protected void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args)
	{
		
		Case1 c1=new Case1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		
	}
	
}
