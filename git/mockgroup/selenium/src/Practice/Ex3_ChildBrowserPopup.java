package Practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_ChildBrowserPopup
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://secure.indeed.com/auth");
		
		
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("parentID: "+parent);
		
		Set<String> Id = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(Id);
		String Parent1 = al.get(0);
		System.out.println("parentID:"+ Parent1);
		
		String child1 = al.get(1);
		System.out.println("childID: "+child1);
		
		driver.switchTo().window(child1);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("abc@gmail.com");
		
		driver.switchTo().window(Parent1);
		driver.findElement(By.xpath("//input[@name='__email']")).sendKeys("def@gmail.com");
	}

}
