package selenium_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_brokenLinks 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://website.informer.com/deadlinkcity.com");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int BrokenLinks=0;
		
		for(WebElement element:Links)
		{
			String url = element.getAttribute("href");
			if(url==null ||url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			URL link=new URL(url);
			try
			{
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
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
			catch(Exception e)
			{
				
			}	
			
		}
		System.out.println("No.of broken Links"+BrokenLinks);
		
		
	}

}
