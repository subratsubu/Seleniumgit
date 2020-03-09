package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DependentIndependentXpath 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://Selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='java']/..//a[.='Download']")).click();
		
	}

}
