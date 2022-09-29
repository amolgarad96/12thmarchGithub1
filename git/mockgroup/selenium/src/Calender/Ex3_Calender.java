package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_Calender 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']")).click();
		//String date="4";
		String month="Oct";
		String year="2022";
//		WebElement calender = driver.findElement(By.xpath("//div[@class='clearfix rb-calendar-main']"));
//		Actions act=new Actions(driver);
		
		//act.moveToElement(calender).perform();
		
		while(true)
		{
			String month1 = driver.findElement(By.xpath("//span[text()='Sep']")).getText();
			String year1 = driver.findElement(By.xpath("//span[text()='2022']")).getText();
			
			if(month.equalsIgnoreCase(month1) && year.equals(year1))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("(//div[@class='clearfix rb-calendar-main']//div)[19]//li[1]")).click();
			}
			
		}
		
	}

}
