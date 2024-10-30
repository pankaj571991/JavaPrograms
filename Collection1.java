package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 
{
public static void main(String[] args) 
{
	
	Collection c1= new ArrayList();
	c1.add(45);
	c1.add("Pankaj");
	c1.add(171);
	c1.add(6.8);
	c1.add(true);
	c1.add('c');
	System.out.println(c1);
	
	Collection c2= new ArrayList();
	c2.addAll(c1);
	c2.add(123);
	System.out.println(c2);
	
	boolean b1= c1.equals(c2);
	System.out.println(b1);
	
	boolean b2= c1.contains("Pankaj");
	System.out.println(b2);
	boolean b3= c2.containsAll(c1);
	System.out.println(b3);
	
	//c1.clear();
	System.out.println(c1);
	System.out.println(c2);
	boolean b5= c1.isEmpty();
	System.out.println(b5);
	
	c1.remove("Pankaj");
	System.out.println("The new c1 is: "+c1);
	c2.removeAll(c1);
	System.out.println("The new c2 is: "+c2);
	
	//indexing -> TRUE
	//Order of insertion -> TRUE
}
}
