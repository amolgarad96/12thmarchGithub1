package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6_ListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		
		Select s=new Select(month);
		s.selectByVisibleText("Jul");
	
		//WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        s1.selectByVisibleText("28");
        
        
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select s2=new Select(year);

		s2.selectByVisibleText("2021");
		
		
		
		
	} 

}
