package qspider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "D:\\Qspider\\selenium\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
