package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex7_Excell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
		double value = WorkbookFactory.create(file).getSheet("sheet2").getRow(4).getCell(1).getNumericCellValue();
		System.out.println(value);
		
		
	}

}
