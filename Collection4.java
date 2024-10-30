package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection4 
{

public static void main(String[] args) 
{
	List li=new ArrayList();	
	li.add(76);
	li.add(7);
	li.add(6);
	li.add(760); //all add from list interface
	li.add(706);
	li.add(607);
	li.add(67);
	//accept null
	//accept indexing
	//order of insertion
	//accept duplicates
	Collections.sort(li);
	//System.out.println(li);
	
	Iterator i1= li.iterator();
	 while(i1.hasNext())
	 {
		 System.out.println(i1.next());
	 }
	

}

}
