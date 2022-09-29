package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_GroupingTC 
{
	@Test(groups = "login")
	public void TC201()
	{
		Reporter.log("running TC201",true);
	}
	@Test(groups="payment")
	public void TC202()
	{
		Reporter.log("running TC202",true);
	}
	@Test(groups="login")
	public void TC203()
	{
		Reporter.log("running TC203",true);
	}
	@Test(groups="logout")
	public void TC204()
	{
		Reporter.log("running TC204",true);
	}
	@Test(groups="verification")
	public void TC205()
	{
		Reporter.log("running TC205",true);
	}
	@Test(groups="verification")
	public void TC206()
	{
		Reporter.log("running TC206",true);
	}

}
