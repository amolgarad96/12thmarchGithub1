package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex10_ListBox 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(day);
		s.selectByValue("22");
		
		if(s.isMultiple())
		{
			System.out.println("ListBox is Multiselectable");
		}
		else
		{
			System.out.println("ListBox is not Multiselectable");
		}
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
	
		
	}

}
