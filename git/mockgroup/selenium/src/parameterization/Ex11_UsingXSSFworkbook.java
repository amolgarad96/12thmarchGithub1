package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex11_UsingXSSFworkbook 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");		
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		String value = workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
	}

}
