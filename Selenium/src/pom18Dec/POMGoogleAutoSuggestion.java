package pom18Dec;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMGoogleAutoSuggestion 
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchTextfield;
	
	@FindBy(xpath="//span[contains(text(),'selenium')]")
	private List<WebElement> suggestions;
	
	public POMGoogleAutoSuggestion(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void google() throws InterruptedException
	{
		searchTextfield.sendKeys("selenium");
		Thread.sleep(5000);
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		suggestions.get(4).click();
	}
}
