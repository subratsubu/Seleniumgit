package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);

	}

}
