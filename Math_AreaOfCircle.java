package basicsprograms;

public class Math_AreaOfCircle 
{
	  static final double pivalue=Math.PI;
	  
	public static void main(String[] args) throws InterruptedException 
	{
		
		double radius=Math.random();
		
		double area=pivalue*radius*radius;
		Thread.sleep(1000);
		System.out.println("Area of circle using math class is: "+area);
		
		
		
	}

}
