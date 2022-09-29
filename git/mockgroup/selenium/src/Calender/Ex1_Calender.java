package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_Calender 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
//		Actions act=new Actions(driver);
//		act.moveToElement(firstdate).click().build().perform();
		
		WebElement date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[2]"));
		date.click();
		
		
		
	}

}
