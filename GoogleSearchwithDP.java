package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchwithDP 
{
	
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[] []  {{"Modi"},{"Air Pollution"},{"Bangalore"},{"SRK"},{"Salman Khan"}};
	}
	
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[] []  {{"11"},{"121"},{"547"},{"141"},{"474"}};
	}
	
	
	@Test(dataProvider="data2")
	public void googlesearch(String input)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys(input);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
	
}
