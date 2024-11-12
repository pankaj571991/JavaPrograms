package SeleniumBegining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoAmazon
{

public static void main(String[] args)
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("ap_email"));
	e1.sendKeys("stbymkt@gmail.com");
	
	WebElement e2=driver.findElement(By.id("continue"));
	e2.click();
	
	WebElement e3= driver.findElement(By.name("password"));
	e3.sendKeys("uytredsxdcfghj");
	
	WebElement e4= driver.findElement(By.name("signInSubmit"));
	e4.click();
	
}

}
