package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("google"))
			//if(title.equal("google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
