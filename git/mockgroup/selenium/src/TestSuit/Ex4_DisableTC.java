package TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex4_DisableTC 
{
	@Test
	public void TC100()
	{
		Reporter.log("running TC100",true);
	}
	@Test
	public void TC101()
	{
		Reporter.log("running TC101",true);
	}
	@Test
	public void TC102()
	{
		Reporter.log("running TC102",true);
	}

}
