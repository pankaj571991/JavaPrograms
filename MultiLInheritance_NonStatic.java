package basicsprograms;
class MultiLInheritance_NonStatic4
{
	void add1()
	{
		System.out.println("add1");
	}
}
class MultiLInheritance_NonStatic3 extends MultiLInheritance_NonStatic4
{
	void add2()
	{
		System.out.println("add2");
	}
}
class MultiLInheritance_NonStatic2 extends MultiLInheritance_NonStatic3
{
	void add3()
	{
		System.out.println("add3");
	}
}
public class MultiLInheritance_NonStatic extends MultiLInheritance_NonStatic2
{
	void add4()
	{
		System.out.println("add4");
	}
	
	public static void main(String[] args) 
	{
		MultiLInheritance_NonStatic m1=new MultiLInheritance_NonStatic();
		
		m1.add1();
		m1.add2();
		m1.add3();
		m1.add4();
		
	}
	
	
	
}
