package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTravesing 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Sele\\Web Create text\\XpathTravesing.html");
		driver.findElement(By.xpath("//body//div[3]//input[2]")).click();
		driver.findElement(By.xpath("//div[3]//input[2]/../../..//div[1]//input[1]")).click();

	}

}
