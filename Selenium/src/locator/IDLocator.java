package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDLocator 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		
		//"WebElement email=driver.findElement(By.id("email")).sendkey("subu");//
		
		driver.findElement(By.id("Email")).sendKeys("subrat");

	}

}
