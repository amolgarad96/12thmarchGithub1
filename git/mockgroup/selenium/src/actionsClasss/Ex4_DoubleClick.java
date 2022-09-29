package actionsClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		Actions act=new Actions(driver);
		
//		act.moveToElement(click).perform();
//		act.doubleClick().perform();
//		act.moveToElement(click).doubleClick().build().perform();
		act.doubleClick(click).perform();
		
		
		
	}

}
