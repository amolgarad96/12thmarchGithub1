package browser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ex3_ScreenShot 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest = new File("C:\\Users\\Admin\\Desktop\\browser\\Screenshot\\TC.jpg");
		 
		FileHandler.copy(src, dest);
		 
		
	}

}
