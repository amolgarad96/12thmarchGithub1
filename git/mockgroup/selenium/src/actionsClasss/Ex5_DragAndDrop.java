package actionsClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);

//		act.dragAndDrop(src, dest).perform();
		
		act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
	}

}
