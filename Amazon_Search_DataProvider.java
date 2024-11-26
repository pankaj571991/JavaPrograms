package testngprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_Search_DataProvider 
{
	@DataProvider(name = "items")
	public Object[][] method1()
	{
		Object data[][]=new Object[10][1];
		data[0][0] = "mobiles";
		data[1][0] = "shoe";
		data[2][0] = "slippers";
		data[3][0] = "ear phones";
		data[4][0] = "mouse wireless";
		data[5][0] = "mouse wired";
		data[6][0] = "jacket";
		data[7][0] = "mobile back cover";
		data[8][0] = "sunglasses";
		data[9][0] = "geaser";
		return data;
		
	}
	
	@Test(dataProvider="items")
	public void amazon(String search) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("items");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}
	
}
