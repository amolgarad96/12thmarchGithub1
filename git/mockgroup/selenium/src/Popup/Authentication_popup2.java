package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Authentication_popup2
{
	
	@Test
	public void AuthPopup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browsernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//  http://username:password@test.com
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		String act = driver.findElement(By.xpath("//p")).getText();
		String exp="Congratulations! You must have the proper credentials.";
		Assert.assertEquals(act, exp);
		
		
		
	}

}
