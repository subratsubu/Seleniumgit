package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Sele\\Web Create text\\css.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Subrat");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("subu");

	}

}
