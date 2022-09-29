package scenario;

import java.util.ArrayList;
import java.util.Arrays;
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

import com.google.common.collect.Multiset.Entry;

public class HighestAndLowestPrice 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		for(int i=1;i<product.size();i++)
		{
			String value = price.get(i).getText().replaceAll(",", "");//8,999=8999
			String prod = product.get(i).getText();
			int int1 = Integer.parseInt(value);
			mp.put(int1, prod);
		}
		
		
		Set<Integer> keys = mp.keySet();
		ArrayList<Integer> al=new ArrayList<Integer>(keys);
		Collections.sort(al);
		System.out.println(al);
		
		int lowPrice = al.get(0);
		System.out.println(lowPrice+"   "+mp.get(lowPrice));//101  amol
		
		Thread.sleep(2000);
		
		int HighPrice=al.get(al.size()-1);
		System.out.println(HighPrice+"  "+mp.get(HighPrice));
	
		
	}

}
