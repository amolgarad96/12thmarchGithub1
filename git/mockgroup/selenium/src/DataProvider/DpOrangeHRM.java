package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DpOrangeHRM 
{
	@Test(dataProvider = "loginTest")
	public void login(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browsernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).isDisplayed());
		
		
	}
	
	@DataProvider(name="loginTest")
	public Object[][] dp1()
	{
		Object[][] data=new Object[3][2];   // un pwd pin
		data[0][0]="Admin";
		data[0][1]="admin123";
		data[1][0]="Admin";
		data[1][1]="ad123";
		data[2][0]="adm";
		data[2][1]="admin123";
		return data;
	}

}
