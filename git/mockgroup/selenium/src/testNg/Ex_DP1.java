package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex_DP1 
{
	
	@Test(dataProvider = "login")
	public void Test(Object[] s) 
	{
		System.out.println(s[0]+" "+s[1]);
	}
	
	@DataProvider(name="login")
	public Object[][] dp1()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="amol";
		data[0][1]=123;
		
		data[1][0]="rahul";
		data[1][1]="456";
		
		return data;
	}

}
