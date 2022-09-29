package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_HighandLowPrice
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shoes for men");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> product = driver.findElements(By.xpath("//div//h2"));
		
		//div[@class='a-section a-spacing-base a-text-center']//h2
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		int rate = 0;
		for(int i=1;i<product.size();i++)
		{
			//String rate = price.get(i).getText();
			if(price.contains(","))
			{
				 rate=Integer.parseInt(price.get(i).getText().replaceAll(",", ""));
				 rate++;
			}
			else
			{
				rate=Integer.parseInt(price.get(i).getText());
				rate++;
			}
			
			String name = product.get(i).getText();
			
			mp.put(rate,name);
		}
		
		Set<Integer> value = mp.keySet();
	
		
		ArrayList<Integer> al=new ArrayList<Integer>(value);
		Collections.sort(al);
		
		System.out.println(al);
		
		
		
		
		
		
		
	}

}
