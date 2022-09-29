package Practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Ex11_Screenshot 
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\selenium\\browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String rs=RandomString.make(3);
		
		File dest=new File("C:\\Users\\Admin\\Desktop\\browser\\Screenshot\\"+rs+".jpg");
		
	   FileHandler.copy(src, dest);
		
		
	}

}
