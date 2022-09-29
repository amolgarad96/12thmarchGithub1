package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex5_enabledKeyword 
{
	@Test()
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test(enabled = true)
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}

}
