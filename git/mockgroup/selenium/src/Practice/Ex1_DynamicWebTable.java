package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_DynamicWebTable
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/51203/sl-vs-afg-1st-match-group-b-asia-cup-2022");
		
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]"));
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]/div"));
		int rowsize = row.size();
		System.out.println(rowsize);
		
		List<WebElement> cell = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]/div)[1]/div"));
		int cellsize = cell.size();
		System.out.println(cellsize);
		System.out.println("--------");
		
		WebElement run = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]/div[3]/div[4]"));
		String bowl = run.getText();
		System.out.println(bowl);
		
		System.out.println("---------------");
		for(int i=1;i<=rowsize;i++)
		{
			for(int j=1;j<=cellsize;j++)
			{
				String text = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]/div["+ i +"]/div["+ j +"]")).getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		
	}

}
