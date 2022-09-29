package LibraryFiles;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTestdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Amazon_maven\\ExcellSheet\\ExcellSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet3");
		String data = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return data;
	}
	
	
	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Amazon_maven\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String value=p.getProperty(key);
		return value;
	}
	
	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\Amazon_maven\\ScreenShot\\Testcases"+TCID +".jpg");
		
		FileHandler.copy(src, dest);
	}

	
	
}
