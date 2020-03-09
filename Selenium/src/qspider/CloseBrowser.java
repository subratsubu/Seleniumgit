package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		//driver.close();
		driver.quit();

	}

}
