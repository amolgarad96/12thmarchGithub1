package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex8_FetchDataFromRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
	    Sheet sh= WorkbookFactory.create(file).getSheet("sheet2");
	    
	    int cellsize = sh.getRow(0).getLastCellNum();
	    System.out.println(cellsize);
	    
	    int rowsize = sh.getLastRowNum();
	    System.out.println(rowsize);
	    
	    
	    for(int i=0; i<=cellsize-1;i++)
	    {
	    	String value = sh.getRow(0).getCell(i).getStringCellValue();
	    	System.out.println(value);
	    }
		
	}

}
