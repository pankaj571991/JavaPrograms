package basicsprograms;

import java.util.Arrays;

public class ArraysReverseOrder 
{

	public static void main(String[] args) 
	{
		int student[] = new int[4];
		student[0]=10;
		student[1]=20;
		student[2]=30;
		student[3]=40;
		int student1[] = new int[4];
		
		for(int i=0,k=3;i<student.length;i++,k--)
		{
			student1[k]=student[i];
		}
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(student1));
		
	}

}
