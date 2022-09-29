package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex3_DynamicWebelement 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38357/1st-test-south-africa-tour-of-england-2022");
		String wicket = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'][2]//div)[69]")).getText();
		System.out.println(wicket);
		
		
	}

}
