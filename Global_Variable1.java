package basicsprograms;

public class Global_Variable1 
{
	
	static int a=100; //Static variable
	int b=90; //Non static variable
	
	public static void main(String[] args) 
	{
		System.out.println(a);     // Directly call static variable
		
		Global_Variable1 g1=new Global_Variable1();
		g1.b=7;
		System.out.println(g1.b);   //Non static can call with ref_variable g1
		
		
		
	}

}
