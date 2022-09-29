package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
		String text = alt.getText();
		System.out.println(text);
		
	}

}
