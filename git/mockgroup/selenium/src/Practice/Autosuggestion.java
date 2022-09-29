package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//how to handle Autosuggestion in youtube


public class Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browsernew\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/");////ul[@class='sbsb_b']//li//div[2]/b
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("india");
		
		driver.switchTo().frame("//div[@class='gstl_50 sbdd_a']");
		
		List<WebElement> data = driver.findElements(By.xpath("//div[@class='gstl_50 sbdd_a']//li"));
		for(WebElement s1:data)
		{
			System.out.println(s1.getText());
		}
	  		
	}

}
