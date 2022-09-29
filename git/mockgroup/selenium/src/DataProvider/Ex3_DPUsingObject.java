package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex3_DPUsingObject
{
	@Test(dataProvider = "dp3")
	public void Test3(Object i)
	{
		System.out.println(i);
	}
	
	@DataProvider()
	public Object[] dp3()
	{
		Object[] data=new Object[3];
		data[0]=1;
		data[1]="amol";
		data[2]="MH25";
		return data;
	}

	
}
