package browser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Ex4_ScreenShot
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Desktop\\browser\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.primevideo.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		Dimension s1 = driver.manage().window().getSize();
//		System.out.println(s1);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String TC=RandomString.make(3);
		File dest=new File("C:\\Users\\Admin\\Desktop\\browser\\Screenshot\\amazon"+TC+".jpg");
		
		
		
		FileHandler.copy(src, dest);
		
	}

}
