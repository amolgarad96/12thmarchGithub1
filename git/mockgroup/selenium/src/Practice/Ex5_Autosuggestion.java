package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_Autosuggestion 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(3000);
		
		List<WebElement> value = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(value.size());
		System.out.println(value.get(1).getText());
		for(int i=0;i<=value.size()-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(value.get(i).getText());
			}
		}
		
	}

}
