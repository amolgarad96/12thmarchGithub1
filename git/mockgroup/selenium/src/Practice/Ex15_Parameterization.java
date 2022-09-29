package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Ex15_Parameterization 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		int rowsize = sh.getLastRowNum();
		System.out.println(rowsize);
		
		for(int i=0;i<=rowsize;i++)
		{
			
			int cellsize = sh.getRow(i).getLastCellNum();
			for(int j=0;j<=cellsize-1;j++)
			{
			    CellType type = sh.getRow(i).getCell(j).getCellType();
			    if(type==CellType.STRING)
			    {
			    	 String value1 = sh.getRow(i).getCell(j).getStringCellValue();
			    	 System.out.print(value1+" ");
			    }
			    else if(type==CellType.NUMERIC)
			    {
			    	double value2 = sh.getRow(i).getCell(j).getNumericCellValue();
			    	System.out.print(value2+" ");
			    }
			    else if(type==CellType.BOOLEAN)
			    {
			    	boolean value3 = sh.getRow(i).getCell(j).getBooleanCellValue();
			    	System.out.print(value3+" ");
			    }
				
			}
			System.out.println();
		}
		
		
	}

}
