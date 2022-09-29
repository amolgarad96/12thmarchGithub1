package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_childBrowserPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.aspsnippets.com/Articles/Access-Child-popup-window-from-parent-window-Javascript.aspx");
		
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
		
		String main = driver.getWindowHandle();
		System.out.println("ParentID: "+main);
		
		Set<String> Id = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(Id);
		String ParentId1 = al.get(0);
		System.out.println("ParentId: "+ParentId1);
		
		String ChildId1 = al.get(1);
		System.out.println("ChildId: "+ChildId1);
		
		driver.switchTo().window(ChildId1);
		driver.findElement(By.xpath("//span[text()='Features']")).click();
		
		driver.switchTo().window(ParentId1);
		driver.findElement(By.xpath("//a[@class='btn btn-red']")).click();
		
	}

}
