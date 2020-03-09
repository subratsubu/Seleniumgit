package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Sele\\Web Create text\\Xpath.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("456");

	}

}
