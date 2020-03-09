package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Qspider\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
