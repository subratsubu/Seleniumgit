package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CsselectorFB 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("a");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("abc");

	}

}
