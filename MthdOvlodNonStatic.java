package basicsprograms;

public class MthdOvlodNonStatic 
{

	void addition(double a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void addition(int a, int b) 
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void addition(int a,double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void addition(double a,int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{

		MthdOvlodNonStatic m1=new MthdOvlodNonStatic();
		m1.addition(32,64);
		m1.addition(6.96,9.98);
		
		
	}

}
