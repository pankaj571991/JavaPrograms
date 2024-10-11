package basicsprograms;

public class ArrayNumberChecking 
{

	public static void main(String[] args) 
	{
		int student[]=new int[4];
		student[0]=74;
		student[1]=96;
		student[2]=72;
		student[3]=70;
		
		int notocheck=70;
		
		for(int i=0;i<4;i++)
		{
			if(notocheck==student[i])
			{
				System.out.println(notocheck +" is a part of array at the index position " + i);
			}
		}
	}

}
