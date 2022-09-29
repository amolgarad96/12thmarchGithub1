package DataProvider;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex4_DPUsingIteratorString 
{
	@Test(dataProvider = "dp4")
	public void Test4(String s)
	{
		System.out.println(s);
		
	}
	@DataProvider()
	public Iterator<String> dp4()
	{
		ArrayList<String> data = new ArrayList<String>();
		data.add("amol");
		data.add("rahul");
		data.add("mayur");
		return data.iterator();
		
	}

}
