package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex5_webTable 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		//ISTQB
		WebDriver driver=new EdgeDriver();
		driver.get("https://www2.asx.com.au/");
		//driver.switchTo().frame("")
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h5[text()='S&P ASX200 top 5']")).click();
		int rowsize = driver.findElements(By.xpath("//table[@class='md-bootstrap-tooltip']//tr")).size();
		System.out.println(rowsize);
		
		
	}

}
