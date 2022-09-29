package actionsClasss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_MouseEvent 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		
		//act.contextClick().perform();
		act.doubleClick().perform();
		
	}

}
