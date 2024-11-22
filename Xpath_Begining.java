package seleniumprogramsbegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_Begining 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pankaj/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		
		WebElement e1= driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Username Text");
		WebElement e2= driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Hint Text");
		WebElement e3= driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("Password Text");
		WebElement e4= driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("FirstName Text");
		Thread.sleep(3000);
		//WebElement e5= driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]"));
		//e5.sendKeys("LasstName Text");
		//WebElement e6= driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
		//e6.click();
		WebElement e7= driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e7.click();
		WebElement e8= driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		e8.click();
		WebElement e9= driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		e9.click();
		WebElement e10= driver.findElement(By.xpath("(/html/body/input)[4]"));
		e10.click();
		//WebElement e11= driver.findElement(By.xpath("(/html/body/input)[5]"));
		//e11.click();
		WebElement e12= driver.findElement(By.xpath("(/html/body/input)[6]"));
		e12.click();
		//driver.findElement(By.linkText("Click to know about us")).click();
		
		
		WebElement e13= driver.findElement(By.id("Relegion"));
		Select s1=new Select(e13);
		//s1.selectByIndex(0);
		//s1.selectByValue("1");
		s1.selectByVisibleText("Christian");
		
	}

}
