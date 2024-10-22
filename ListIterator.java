package collection;

import java.util.ArrayList;
import java.util.List;

public class ListIterator 
{

public static void main(String[] args) 
{
	List l1=new ArrayList();	
	l1.add(76);
	l1.add(7);
	l1.add(6);
	l1.add(760); //all add from list interface
	l1.add(706);
	l1.add(607);
	l1.add(67);
	
	ListIterator l2=l1.listIterator();
			
	System.out.println("Forward");
	while(l2.hasNext())
	{
		System.out.println(l2.next());
	}
	System.out.println("Backward");
	while(l2.hasPrevious())
	{
		System.out.println(l2.previous());
	}
	
	
}

private char[] previous() {
	// TODO Auto-generated method stub
	return null;
}

private boolean hasPrevious() {
	// TODO Auto-generated method stub
	return false;
}

private char[] next() {
	// TODO Auto-generated method stub
	return null;
}

private boolean hasNext() {
	// TODO Auto-generated method stub
	return false;
}

}
