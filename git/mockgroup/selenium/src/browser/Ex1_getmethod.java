package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getmethod 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		
		
	}
	
	
	
	
	
	
	
	

}
