package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex2_DPUsingInt 
{
	@Test(dataProvider = "dp2")
	public void Test2(Integer s)
	{
		System.out.println(s);
	}
	
	@DataProvider()
	public Integer[] dp2()
	{
		Integer[] data=new Integer[3];
		data[0]=1;
		data[1]=2;
		data[2]=3;
		return data;
		
	}

}
