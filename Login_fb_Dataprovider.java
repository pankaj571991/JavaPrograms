package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_fb_Dataprovider 
{
	
	@DataProvider(name = "logindetails")
	public Object[][] method1()
	{
		Object data[][] = new Object[4][2];
		//1st row - 1st testcase
		data[0][0] = "stbymkt@@gmail.com"; //valid UN
		data[0][1] = "stbym123"; //valid pwd
		
		//2nd row - 2nd testcase
		data[1][0] = "stbymkt@@gmail.com"; //valid UN
		data[1][1] = "stbym12"; //Invalid pwd
		
		//3rd row - 3rd testcase
		data[2][0] = "stbymkt@@gmail.com"; //INvalid UN
		data[2][1] = "stbym123"; //Invalid pwd
				
		//2nd row - 2nd testcase
		data[3][0] = ""; //NULL UN
		data[3][1] = ""; //NULL pwd
		return data;
				
				
	}
	
	
	@Test(dataProvider = "logindetails")
	public void fblogin(String username, String password)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("username");
		driver.findElement(By.name("pass")).sendKeys("Password");
		driver.findElement(By.name("login")).click();
	}
	
}
