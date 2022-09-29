package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_NestedIframe 
{
	
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm3");
		driver.switchTo().frame("frm1");
		
		WebElement menu = driver.findElement(By.xpath("//select[@id='selectnav2']"));
		
		Select s=new Select(menu);
		s.selectByVisibleText("Contact");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("amol");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='name'][1]")).sendKeys("abc");
		
		
		
		
	}

}
