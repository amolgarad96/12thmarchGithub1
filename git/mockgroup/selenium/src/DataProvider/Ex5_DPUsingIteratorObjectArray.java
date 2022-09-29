package DataProvider;

import java.util.HashSet;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ex5_DPUsingIteratorObjectArray 
{
	@Test(dataProvider = "dp5")
	public void Test5(Object[] s)
	{
		//System.out.println(s[0]+" "+s[1]);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	@DataProvider()
	public Iterator<Object> dp5()
	{
		HashSet<Object> data = new HashSet<Object>();
		data.add(new Object[] {"amol",1});
		data.add(new Object[] {"sumit",10});
		return data.iterator();
	}

}
