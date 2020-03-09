package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByGroupIndex 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'])[1]")).sendKeys("Subrat");
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'])[1]")).sendKeys("Subu");

	}

}
