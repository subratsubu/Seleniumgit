package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DiscoverLink 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		WebElement link=driver.findElement(By.linkText("Forgot?"));
		link.click();
		System.out.println(link.getText());

	}

}
