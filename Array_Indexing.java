package basicsprograms;

import java.util.Arrays;

public class Array_Indexing
{

	public static void main(String[] args)
	{
		int rollno[]=new int[5];
		
		rollno[0]=78;
		rollno[1]=7;
		rollno[2]=71;
		rollno[3]=6;
		rollno[4]=78; // duplicate value can have in array
		for(int i=0;i<=3;i++)
		{
			System.out.println(rollno[i]);
		}
		System.out.println(Arrays.toString(rollno));
		
		String name[]=new String[3];
		name[0]="ram";
		name[1]="sahu";
		name[2]="pooja";
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println(Arrays.toString(name));
		
		char gender[]=new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='C';
		//gender[3]=''; we cannot pass null value in an array.
		System.out.println(Arrays.toString(gender));
	}

}
