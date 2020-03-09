package pomtest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pom.POMActitimeCustomerPage;
import pom.POMActitimeLoginPage;
import pom.POMActitimeWorkPage;

public class TESTActitime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		POMActitimeLoginPage login=new POMActitimeLoginPage(driver);
		login.loginMethod();
		
		POMActitimeCustomerPage customer=new POMActitimeCustomerPage(driver);
		customer.customerMethod();
		
		POMActitimeWorkPage work=new POMActitimeWorkPage(driver);
		work.workMethod();

	}

}
