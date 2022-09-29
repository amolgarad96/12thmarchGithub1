package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.orangehrm.com/");//a[text()='Why OrangeHRM']
		
		WebElement s1 = driver.findElement(By.xpath("((//ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']//li)[8]//div//li)[1]"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		Thread.sleep(3000);
		act.moveToElement(s1).click().build().perform();
		
	}

}
