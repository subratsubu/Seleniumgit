package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorActiTime 
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	}

}
