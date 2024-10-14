package basicsprograms;

public class Matches_Strings_Expression 
{

	public static void main(String[] args) 
	{
		//Q) In the given string "cat" check if the string has exact 3 letters in it?
		String name="cat";
		boolean b1=name.matches("...");		
		System.out.println(b1);
		
		//Q) In the given string "cat" check if the string input starts with c?
		String a="cat";
		boolean a1= a.matches("c(.*)");
		System.out.println(a1);
		//Q) In the given string "cat" check if the string input ends with t?
		boolean a2= a.matches("(.*)t");
		System.out.println(a2);
		
		//Q) In the given string "manish" check if "n" is present or not?
		String a3="manish";
		boolean a4= a3.matches("(.*)n(.*)");
		System.out.println(a4);
		
	}

}
