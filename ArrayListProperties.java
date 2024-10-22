package collection;

import java.util.ArrayList;

public class ArrayListProperties 
{

public static void main(String[] args) 
{
	ArrayList a1=new ArrayList();
	a1.add(13);
	a1.add(31);
	a1.add("java");
	a1.add("Selenium");
	a1.add(897);
	
	ArrayList a2=new ArrayList();
	a2.add("Laptop");
	a2.add("January");
	a2.addAll(a1);
	System.out.println(a1);
	System.out.println(a2);
	
	//a2.remove(0);
	//System.out.println(a2);
	a2.removeAll(a1);
	System.out.println(a2);
}

}
