package seleniumprogramsbegining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion 
{

public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoe");
	Thread.sleep(2000);
	List<WebElement>	e2=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	
	e2.get(e2.size()-1).click();
}

}
