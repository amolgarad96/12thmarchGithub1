package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex_DP 
{
	@Test(dataProvider = "login")
	public void Test(Object username,Object password) 
	{
		System.out.println(username+" "+password);
	}
	
	@DataProvider(name="login")
	public Object[][] dp1()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="amol";
		data[0][1]="am123";
		
		data[1][0]="rahul";
		data[1][1]="rah456";
		
		return data;
	}

}
