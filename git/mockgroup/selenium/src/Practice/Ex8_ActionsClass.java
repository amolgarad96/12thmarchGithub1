package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex8_ActionsClass 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']/a"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(src).clickAndHold().release(dest).build().perform();
		
	}

}
