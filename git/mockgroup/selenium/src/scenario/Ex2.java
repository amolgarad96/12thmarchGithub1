package scenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("table");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		HashMap<String,String> mp=new HashMap<String,String>();
		Thread.sleep(3000);
		for(int i=1;i<=product.size()-1;i++)
		{
			String k1 = price.get(i).getText().replaceAll(",", "");
			String value = product.get(i).getText();
			//int key = Integer.parseInt(k1);
			mp.put(k1, value);
			System.out.println(mp);
		}
		Set<String> keys = mp.keySet();

		ArrayList<String> al=new ArrayList<String>(keys);
		Collections.sort(al);
		//System.out.println(al);
		String low = al.get(0);
		System.out.println(low);
		
		String high = al.get(al.size());
		System.out.println(high);
		

		
	}

}
