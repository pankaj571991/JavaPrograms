package SeleniumBegining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_PartialLinktext 
{

public static void main(String[] args) 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement e1= driver.findElement(By.linkText("Gmail"));
	WebElement e2= driver.findElement(By.linkText("Gma"));
	e2.sendKeys(Keys.ENTER);

	
	
}

}
