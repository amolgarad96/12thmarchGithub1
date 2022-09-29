package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_DynamicWebElement
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13 pro max");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//div[@class='sg-row']//a/span)[5]")).click();
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(id);
		String Parentid = al.get(0);
		System.out.println(Parentid);
		
		String Childid = al.get(1);
		System.out.println(Childid);
		
		driver.switchTo().window(Childid);
		
		String value = driver.findElement(By.xpath("((//div[@id='centerCol']//div)[9]//span)[7]//a//span")).getText();
		System.out.println(value);
		
		
		
		
		
	}

}
