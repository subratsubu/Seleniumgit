package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Sele\\Web Create text\\TagName.html");
		driver.findElement(By.tagName("input")).sendKeys("Subrat");
		driver.findElement(By.tagName("input")).sendKeys("Subu");
		

	}

}
