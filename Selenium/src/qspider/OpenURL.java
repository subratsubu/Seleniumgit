package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenURL 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.gmail.com");

	}

}
