package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex9_ListBox 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s=new Select(month);
		s.selectByVisibleText("Aug");
		WebElement s1 = s.getFirstSelectedOption();
		String m1 = s1.getText();
		String s2="Aug";
		//System.out.println(m1);
	
		
		if(m1.equals(s2))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		
		
		
		
	}

}
