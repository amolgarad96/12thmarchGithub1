package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_listBox 
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(month);
	   // s1.selectByVisibleText("Jan");
	    s1.selectByValue("4");
	   if(s1.isMultiple())
	   {
		   System.out.println("ListBox is Multiselectable");
	   }
	   else
	   {
		   System.out.println("ListBox is single selectable");
	   }
		
	}

}
