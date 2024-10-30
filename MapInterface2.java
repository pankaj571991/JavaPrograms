package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		//employee name and salary
		
		m1.put("Rashmi", 8532);
		m1.put("Meenu", 9857);
		m1.put("Blake", 7485);
		m1.put("Shantanu", 8541);
		m1.put("Shekhar", 7496);
		
		System.out.println(m1);
		
		Map<String,Integer> m2 = new HashMap<String,Integer>();
		m2.put("Ramesh", 8532);
		m2.putAll(m1);
		System.out.println(m2);
		
		boolean b1= m1.isEmpty();
		System.out.println(b1);
		
		
	}

}
