package Iframe;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_AlertPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	
	driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	Thread.sleep(3000);
	Alert alt = driver.switchTo().alert();
	
	alt.accept();
	
	
	
	}	

}
