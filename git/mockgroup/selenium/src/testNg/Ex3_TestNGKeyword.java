package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex3_TestNGKeyword 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Browser open", true);
	}
	
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login to App",true);
	}
	
	@Test(invocationCount = 2)
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(priority = 0)
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout from App",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("close Browser", true);
	}

}
