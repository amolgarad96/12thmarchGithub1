package multipleLink;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ex1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));

		//https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
//		for(WebElement s1:alllinks)
//		{
//			System.out.println(s1.getText());
//		}
		
		for(int i=0;i<=alllinks.size()-1;i++)
		{
			System.out.println(alllinks.get(i).getText());
		}
		
	}

}
