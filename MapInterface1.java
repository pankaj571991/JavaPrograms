package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1 
{

	public static void main(String[] args) 
	{
		
		Map<String,String> m1 = new HashMap<String,String>();
		m1.put("Aman", "SDET 1");
		m1.put("Pramila", "HR Associate");
		m1.put("Prashanth", "Sales Associate");
		m1.put("Bhumi", "SEO Expert");
		m1.put("Ganesh", "Developer");
		System.out.println(m1);
		
	}

}
