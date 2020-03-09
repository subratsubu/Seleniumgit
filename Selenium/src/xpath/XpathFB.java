package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathFB 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Subrat");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("subrat12345");
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}

}
