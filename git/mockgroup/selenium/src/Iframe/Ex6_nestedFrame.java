package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6_nestedFrame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm1");
		WebElement List = driver.findElement(By.xpath("//select[@id='selectnav1'][1]"));
		Select s=new Select(List);
		s.selectByVisibleText("- SQL");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("amol");
		
		
	}

}
