package Iframe;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_childBrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		String childID = driver.getWindowHandle(); //use to get child window ID
		System.out.println("childBrowserID: "+ childID);
		
		Set<String> Allid = driver.getWindowHandles();//Use to get parentID and Child Window ID
		System.out.println(Allid);
		
		ArrayList<String>  al=new ArrayList<String>(Allid);
		
		String parentid=al.get(0);
		System.out.println("ParentID: "+parentid);
		
		String  childid1= al.get(1);
		System.out.println("ChildID: "+childid1);
		
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(childid1);
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		
		
		
		
	}

}
