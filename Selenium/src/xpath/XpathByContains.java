package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByContains 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		System.out.println(link.getText());
		link.click();
	}

}
