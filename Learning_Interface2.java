package abstractclasses;
interface One
{
	void add();
}
interface Two
{
	void subtract();
}
public class Learning_Interface2 implements One,Two
{
	public static void main(String[] args)
	{
		
		Learning_Interface2 l1=new Learning_Interface2();
		l1.add();
		l1.subtract();
		
	}

	public void subtract()
	{
		System.out.println("subtract");
	}

	public void add()
	{
		System.out.println("add");
	}
	
	
}
