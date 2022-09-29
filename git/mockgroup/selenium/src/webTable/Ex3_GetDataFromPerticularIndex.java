package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex3_GetDataFromPerticularIndex 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\browser\\webtable.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td[2]")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[2]")).getText();
		System.out.println(text1);
		
	}

}
