package seleniumprogramsbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

		;
	}

}
