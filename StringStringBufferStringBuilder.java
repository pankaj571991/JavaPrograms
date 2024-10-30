package mapinterface;

public class StringStringBufferStringBuilder 
{

	public static void main(String[] args) 
	{
		String name=new String("Selenium");
		String name1= name.concat(" Testing");
		System.out.println(name1);
		
		StringBuffer s1=new StringBuffer("Manish");
		s1.append(" Tiwari");
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("INDIA");
		s2.append(" Beautiful country");
		System.out.println(s2);
	}

}
