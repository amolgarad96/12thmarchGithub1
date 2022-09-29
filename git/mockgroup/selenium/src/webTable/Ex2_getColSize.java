package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex2_getColSize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("C:\\Users\\Admin\\Desktop\\browser\\webtable.html");
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colSize);
		
		int HeadSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(HeadSize);
	}

}
