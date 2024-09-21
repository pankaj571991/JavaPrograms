package basicsprograms;

public class Global_Variable 
{

	static int a=100; //global variable
	int b=200; //global variable
	static String name; //global variable with no initialization
	static String name2;
	static boolean answer;
	static boolean answer2;
	
	public static void main(String[] args) 
	{
		
		int c=90; //Local variable
		name="Pankaj";
		answer=true;
		System.out.println(c+a);
		System.out.println(name);
		System.out.println(answer);
		
		System.out.println(name2); //default value
		System.out.println(answer2); // default value
	}

}
