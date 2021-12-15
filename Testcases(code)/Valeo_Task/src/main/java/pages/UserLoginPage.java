package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{

	public UserLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[@class='radius']")
	WebElement loginButton;

	@FindBy(id="flash")
	public WebElement successMessage;

	public void emptyUsernameField(String Password)
	{

		userName.clear();
		password.clear();
		setElementText(password, Password);
		clickButton(loginButton);

	}

	public void emptyPasswordField(String userName1)
	{
		userName.clear();
		password.clear();
		setElementText(userName, userName1);
		clickButton(loginButton);
	}



	public void Login(String userName1 , String Password )
	{
		userName.clear();
		password.clear();
		setElementText(userName, userName1);
		setElementText(password, Password);

		clickButton(loginButton);

	}




}
