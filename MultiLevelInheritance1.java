package basicsprograms;
class MultiLevelInheritance4
{
	static void add4()
	{
		System.out.println("add4");
	}
}
class MultiLevelInheritance3 extends MultiLevelInheritance4
{
	static void add1()
	{
		System.out.println("add1");
	}
}
class MultiLevelInheritance2 extends MultiLevelInheritance3
{
	static void add2()
	{
		System.out.println("add2");
	}
}
public class MultiLevelInheritance1 extends MultiLevelInheritance2
{

	static void add3()
	{
		System.out.println("add3");
	}
	public static void main(String[] args) 
	{

		add1();
		add2();
		add3();
		add4();
		
		
		
	}
}
