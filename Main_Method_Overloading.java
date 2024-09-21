package basicsprograms;

public class Main_Method_Overloading 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		
		Main_Method_Overloading M1=new Main_Method_Overloading();
		M1.main();
		main("Pankaj",'M');
		
		
	}
	void main() 
	{
		System.out.println("Main Method with no argument");
	}
	public static void main(String name,char gender) 
	{
		System.out.println("Main Method with argument as String and gender");
	}

}
