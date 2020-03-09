package pomtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom18Dec.POMGoogleAutoSuggestion;

public class TESTGoogleAutoSuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		POMGoogleAutoSuggestion p=new POMGoogleAutoSuggestion(driver);
		p.google();

	}

}
