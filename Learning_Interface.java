package abstractclasses;
interface Amazon
{
	void login();
	void registration();
}
public class Learning_Interface implements Amazon
{
	
  public static void main(String[] args)
  {
	  Learning_Interface l1=new Learning_Interface();
	  l1.login();
	  l1.registration();
  }
public void login()
{
	System.out.println("Real Logic with you");
}

public void registration()
{
	System.out.println("Real Logic with you");
}	
	
}
