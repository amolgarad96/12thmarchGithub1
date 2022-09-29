package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP1 
{
	@Test(dataProvider = "data")
	public void login(String un, String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browsernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='PIM']")).isDisplayed());
		
	}
	
	@DataProvider                                           //    0       1
	public Object[][] data()                               // 0 Admin  admin123
	{                                                      // 1 Admin  admin12
		Object[][] obj=new Object[3][2];
		obj[0][0]="Admin";
		obj[0][1]="admin123";
		obj[1][0]="Admin";
		obj[1][1]="ad123";
		obj[2][0]="adm";
		obj[2][1]="admin123";
		
		return obj;
		
		
	}

}
