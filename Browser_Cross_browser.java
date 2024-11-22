package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser_Cross_browser 
{
	
	WebDriver driver;
	@Test
	public void launch_browser()
	{
		if(1==9)
		{
			driver= new ChromeDriver();
			
		}
		if(2>=2)
		{
			driver= new FirefoxDriver();
		}
	}
}
