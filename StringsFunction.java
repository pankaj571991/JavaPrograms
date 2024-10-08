package basicsprograms;

public class StringsFunction
{

	public static void main(String[] args)
	{
		
		String a="Automation";
		int l1= a.length();
		System.out.println(l1);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		System.out.println(a.charAt(5));
		
		String b=" Testing";
		
		System.out.println(a.concat(b));
		
		System.out.println(a.concat(" Engineering"));
		
		String c= " automation testing by mkt ";
		System.out.println(c);
		System.out.println(c.trim());
		
		System.out.println(c.isEmpty());
	}

}
