package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMActitimeCustomerPage 
{
public WebDriver driver;
	
	@FindBy(id="container_tasks")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustomerLink;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNameTextfield;
	
	@FindBy(xpath="//div[@class='components_button  withPlusIcon']")
	private WebElement createCustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	public POMActitimeCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void customerMethod()
	{
		taskLink.click();
		addNewButton.click();
		newCustomerLink.click();
		customerNameTextfield.sendKeys("qspiders");
		//createCustomerButton.click();
		cancelButton.click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();

}
}