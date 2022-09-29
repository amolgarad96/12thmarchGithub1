package Module1_Login_Test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Facebook.login_POM1;

public class LoginTest extends BaseClass
{
	public login_POM1 log;
	public int TCID;
	@BeforeMethod
	public void openBrowser() throws IOException
	{
		InitializeBrowser();
		
		log=new login_POM1(driver);
		
	}
	@Test
	public void methodcall() throws IOException
	{
		log.setUsername(UtilityClass.getTestdata(0, 0));
		log.setpassword(UtilityClass.getTestdata(0, 1));
		log.submit();
	}
	
	@AfterMethod
	public void verifylogin(ITestResult result) throws IOException
	{
		TCID = 101;
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.CaptureScreenshot(driver, TCID);
		}
	}
	
	 

}
