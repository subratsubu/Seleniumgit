package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.linkText("actiTIME INC.")).click();
		//driver.close();
		driver.quit();

	}

}
