package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex4_Excell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		boolean value = sh.getRow(2).getCell(0).getBooleanCellValue();
		System.out.println(value);
		
	}

}
