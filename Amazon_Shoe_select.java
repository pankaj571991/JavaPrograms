package seleniumprogramsbegining;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoe_select 
{

public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoe"+ Keys.ENTER);
	
	WebElement e2= driver.findElement(By.xpath(" (//a[@class='a-link-normal s-no-outline'])[1]"));
	e2.click();
	
	java.util.Set<String> id= driver.getWindowHandles();
	Iterator<String> i1= id.iterator();
	
	  String parentid=  i1.next();
	  String childid=  i1.next();
	  System.out.println(parentid);
	  System.out.println(childid);
	  
	  driver.switchTo().window(childid);
	WebElement e3= driver.findElement(By.id("add-to-cart-button"));
	e3.click();

	  
	 // Thread.sleep(3000);
	//  driver.close();
	  
}

}
