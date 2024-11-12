package SeleniumBegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("india");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		
	}

}
