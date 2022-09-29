package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_webtable 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/50972/nedw-vs-irew-2nd-odi-ireland-women-tour-of-netherlands-2022");
		
		WebElement scorecard = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]"));
		
		List<WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"innings_2\"]/div[4]/div"));
		int r1 = rowelement.size();
		System.out.println(r1);
		
		List<WebElement> columnelement = driver.findElements(By.xpath("//*[@id=\"innings_2\"]/div[4]/div[2]/div"));
		int c1 = columnelement.size();
		System.out.println(c1);
		
		for(int i=1;i<=r1;i++)
		{
			
			for(int j=1;j<=c1;j++)
			{
				String text = driver.findElement(By.xpath("//*[@id=\"innings_2\"]/div[4]/div["+ i +"]/div["+ j +"]")).getText();
				System.out.print("  "+text+"  ");
				
//				if(i==5&j==2)
//				{
//					String value = driver.findElement(By.xpath("//*[@id=\"innings_2\"]/div[4]/div[i]/div[j]")).getText();
//					System.out.println(value);
//				}
			}
			System.out.println();
			
		}
		
	}

}
