package TestSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex5_MultiBrowserTestig 
{
	@Parameters("Browsername")
	@Test
	public void Chrome(String Browsername)
	{
		WebDriver driver=null;
		if(Browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chrome105\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(Browsername.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		s.selectByVisibleText("Jul");
		
		
	}

}
