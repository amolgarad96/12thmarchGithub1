package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex7_dependsOnMethods 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("browser open", true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login to app", true);
	}
	@Test
	public void verifyUserID()
	{
		Reporter.log("verify id", true);
	}
	@Test(dependsOnMethods = "verifyUserID")
	public void verifypin()
	{
		Reporter.log("verify pin", true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout from app", true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Close browser", true);
	}
}
