package Calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Calendermonth 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
		
	}

}
