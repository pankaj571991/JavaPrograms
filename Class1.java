package abstractclasses;
abstract class class3
{
	abstract void method1(); //abstract method
	abstract void method2(); //abstract method
	void method4()       //concrete method
	{
		System.out.println("Logic for logout from system");
	}
}
abstract class class2 extends class3
{
	abstract void method3(); //abstract method
	abstract void method5(); //abstract method
}
public class Class1 extends class2
{

	public static void main(String[] args) //concrete method
	{
		
		Class1 c1=new Class1();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		
	}

	
	void method3() //concrete method
	{
		System.out.println("method3");
	}

	
	void method5() //concrete method
	{
		System.out.println("method5");
	}

	
	void method1() //concrete method
	{
		System.out.println("method1");
	}

	
	void method2() //concrete method
	{
		System.out.println("method2");
	}
}
