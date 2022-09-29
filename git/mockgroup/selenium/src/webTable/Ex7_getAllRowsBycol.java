package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex7_getAllRowsBycol 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("C:\\Users\\Admin\\Desktop\\browser\\webtable.html");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					String header = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(header);
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" ");
				}
			}
			System.out.println();
		}
		
	}

}
