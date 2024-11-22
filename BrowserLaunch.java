package seleniumprogramsbegining;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		
	}
	
	
}