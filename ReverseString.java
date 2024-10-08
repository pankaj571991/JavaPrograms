package basicsprograms;

public class ReverseString
{

	public static void main(String[] args)
	{
		
		String input="abcd";
		String output="";
	for(int i=3;i>=0;i--)
	{
		char c1= input.charAt(i);
		output=output+c1;
		
	}
	System.out.println(output);
		
		
	}

}
