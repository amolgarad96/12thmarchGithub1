package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6_Excell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
	int lastrow = sh.getLastRowNum();
	for(int i=0;i<=lastrow;i++)
	{
		int lastcell = sh.getRow(i).getLastCellNum();
		for(int j=0;j<=lastcell-1;j++)
		{
			
			Cell cellinfo = sh.getRow(i).getCell(j);
			CellType type = cellinfo.getCellType();
			if(type==CellType.STRING)
			{
				String str = cellinfo.getStringCellValue();
				System.out.print(str+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				double value1 = cellinfo.getNumericCellValue();
				System.out.print(value1+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean value2 = cellinfo.getBooleanCellValue();
				System.out.print(value2+" ");
			}
			
		}
		
		System.out.println();
		
	}

}
}
