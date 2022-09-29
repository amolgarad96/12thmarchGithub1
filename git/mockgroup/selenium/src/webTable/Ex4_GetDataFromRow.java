package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex4_GetDataFromRow 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\browser\\webtable.html");
		
		for(int i=1;i<=3;i++)
		{
			String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td["+i+"]")).getText();
			System.out.print(text+" ");
		}
		
	}

}
