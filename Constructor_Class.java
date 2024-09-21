package basicsprograms;

public class Constructor_Class 
{

	Constructor_Class()
	{
		System.out.println("Printed Constructor");
	}
	public static void main(String[] args) 
	{
      //Constructor_Class c1=new Constructor_Class(); //1st way to call constructor method by just creating a object with classname.
	  
		//2nd way to call constructor	
      new Constructor_Class(); //2nd way to call constructor method by just creating a object with classname.
      new Constructor_Class(); //Can be call multiple time also.
      new Constructor_Class();
      new Constructor_Class();
      
	}

}
