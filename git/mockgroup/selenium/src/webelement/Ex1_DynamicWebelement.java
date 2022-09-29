package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1_DynamicWebelement 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10 pro");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String rating = driver.findElement(By.xpath("(//div[@class='_2kHMtA'][1]//span)[8]")).getText();
		System.out.println(rating);
		
	}

}
