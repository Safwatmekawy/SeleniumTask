
//candidate: Safwat Mekawy
//Date:12/15/2021
//herokuapp Test

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserLoginPage;

public class ValeoTest extends TestBase{


	UserLoginPage loginObject;

	@Test
	public void emptyUsernameTest_REQ_0001()
	{
		loginObject = new UserLoginPage(getDriver());
		loginObject.emptyUsernameField("SuperSecretPassword!");
		Assert.assertTrue(loginObject.successMessage.getText().contains("username is invalid"));
	}

	@Test
	public void emptyPasswordTest_REQ_0001()
	{
		loginObject = new UserLoginPage(getDriver());
		loginObject.emptyPasswordField("tomsmith");
		Assert.assertTrue(loginObject.successMessage.getText().contains("password is invalid"));

	}

	@Test
	public void invalidLoginCredential_REQ_0002()
	{

		loginObject = new UserLoginPage(getDriver());
		loginObject.Login("test", "123!");
		Assert.assertTrue(loginObject.successMessage.getText().contains("username is invalid"));

	}

	@Test
	public void successLoginTest_REQ_0003()
	{

		loginObject = new UserLoginPage(getDriver());
		loginObject.Login("tomsmith", "SuperSecretPassword!");
		Assert.assertTrue(loginObject.successMessage.getText().contains("secure area"));

	}

}
