package scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:8053/login-service/");
		
	}

}
