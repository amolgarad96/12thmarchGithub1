package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex6_timeoutKeyword
{
	@Test(timeOut = 5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("Running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}

}
