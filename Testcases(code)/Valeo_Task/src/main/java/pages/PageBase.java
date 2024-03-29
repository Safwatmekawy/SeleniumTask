package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver drivir;
    //create constructor
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button)
	{
		
		button.click();
	}
	
	protected static void setElementText(WebElement textElement , String value)
	{
		
		textElement.sendKeys(value);
	}

}
