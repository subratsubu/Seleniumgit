package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathNonBrokenableSpace 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Sele\\Web Create text\\XpathByContains.html");
		driver.findElement(By.xpath("button[contains(text(),'sign')]")).click();
		driver.findElement(By.xpath("button[contains@type,'text')]")).sendKeys("Subrat");
		

	}

}
