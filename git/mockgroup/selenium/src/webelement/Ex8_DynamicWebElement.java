package webelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_DynamicWebElement
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38367/eng-vs-rsa-3rd-test-south-africa-tour-of-england-2022");
		driver.manage().window().maximize();
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]//div//div[1]"));
		int rowsize = row.size();
		System.out.println(rowsize);
		
		List<WebElement> cell = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]//div[1]//div"));
		int cellsize = cell.size();
		System.out.println(cellsize);
		WebElement run = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]/div[4]/div[4]"));
		System.out.println(run.getText());
		
		for(int i=0;i<=rowsize-1;i++)
		{
			for(int j=0;j<=cellsize-1;j++)
			{
				List<WebElement> data = driver.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]//div["+i+"]//div["+j+"]"));
		        for(WebElement s1:data)	
		        {
		        	System.out.print(s1.getText()+"  ");
		        }
		        System.out.println();
			}
		}
		
	}

}
