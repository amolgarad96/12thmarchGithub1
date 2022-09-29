package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex7_NestedFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm3");
		driver.switchTo().frame("frm1");
		WebElement option = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		Select s=new Select(option);
		s.selectByVisibleText("- Testing");
		//Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("amol");
		
		
		
		
	}

}
