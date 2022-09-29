package selenium_;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Links
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//capture link from webpage
		
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		//System.out.println(links.size());
		for(int i=0;i<=links.size()-1;i++)
		{
			String alllinks = links.get(i).getText();
			System.out.println(alllinks);
			System.out.println(links.get(i).getAttribute("href"));
		}
		
	}

}
