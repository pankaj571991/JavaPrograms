package SeleniumBegining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Autosuggestion_1 
{
public static void main(String[] args) throws InterruptedException 
{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(2000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int length=	e2.size();
		e2.get(length-1).click();
		//System.out.println(length);
		/*
		 * for(int i=0;i<length;i++) { WebElement a1= e2.get(i); String autosuggestion=
		 * a1.getText(); System.out.println(autosuggestion);
		 * 
		 * 
		 * }
		 */
}
}
