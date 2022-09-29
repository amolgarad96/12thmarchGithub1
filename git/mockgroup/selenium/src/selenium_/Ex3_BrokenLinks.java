package selenium_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_BrokenLinks 
{
		public static void main(String[] args) throws MalformedURLException, InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browsernew\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("http://www.deadlinkcity.com/");
			Thread.sleep(3000);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int BrokenLinks=0;
			for(WebElement link:links)
			{
				String url = link.getAttribute("href");
				if(url==null || url.isEmpty())
				{
					System.out.println("URL is empty");
				    continue;
				}
			
			
			URL l1=new URL(url);
			try 
			{
				HttpURLConnection httpconn=(HttpURLConnection) l1.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+" is broken Link");
					
					BrokenLinks++;
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+url+" is valid Link");
				}
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				
			}
			System.out.println(BrokenLinks);
			//driver.quit();
			}
		
	}

}
