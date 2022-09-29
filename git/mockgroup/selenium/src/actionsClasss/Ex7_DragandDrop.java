package actionsClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_DragandDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drop = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(drag).clickAndHold().release(drop).build().perform();

	}

}
