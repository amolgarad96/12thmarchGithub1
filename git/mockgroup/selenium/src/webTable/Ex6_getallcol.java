package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex6_getallcol 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("C:\\\\Users\\\\Admin\\\\Desktop\\\\browser\\\\webtable.html");
		
		for(int i=1;i<=4;i++)
		{
			if(i==1)
			{
				 List<WebElement> header = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/th"));
				for(WebElement s2:header)
				{
					System.out.print(s2.getText());
				}
			}
			else
			{
				List<WebElement> text = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]//td"));
				for(WebElement s1:text)
				{
					System.out.println(s1.getText());
				}
			}
		}
	}

}
