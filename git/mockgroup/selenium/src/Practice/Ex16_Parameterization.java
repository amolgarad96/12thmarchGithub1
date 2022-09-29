package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex16_Parameterization 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		int cellsize = sh.getRow(3).getLastCellNum();
		for(int i=0;i<=cellsize-1;i++)
		{
			CellType type = sh.getRow(3).getCell(i).getCellType();
			if(type==CellType.STRING)
			{
				String value1 = sh.getRow(3).getCell(i).getStringCellValue();
				System.out.print(value1+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				double value2 = sh.getRow(3).getCell(i).getNumericCellValue();
				System.out.print(value2+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean value3 = sh.getRow(3).getCell(i).getBooleanCellValue();
				System.out.print(value3+" ");
			}
		}
		
	}

}
