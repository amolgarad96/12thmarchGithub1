package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex1_usingString 
{
	@Test(dataProvider = "dp1")
	public void Test1(String un)
	{
		System.out.println(un);
	}
	
	@DataProvider()
	public String[] dp1()
	{
		String[] str=new String[3];
		str[0]="amol";
		str[1]="rahul";
		str[2]="sumit";
		return str;

	}

}
