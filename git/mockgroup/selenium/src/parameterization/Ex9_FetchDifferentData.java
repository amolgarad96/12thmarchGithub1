package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex9_FetchDifferentData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\browser\\ExcellSheet.xlsx");
	    Sheet sh= WorkbookFactory.create(file).getSheet("sheet2");
	    
	    int rowsize = sh.getLastRowNum();
	    System.out.println(rowsize);
	    
	    short cellsize = sh.getRow(rowsize).getLastCellNum();
	    System.out.println(cellsize);
	    
	    for(int i=0;i<=cellsize-1;i++)
	    {
	    	CellType text = sh.getRow(rowsize).getCell(i).getCellType();
	    	
	    	if(text==CellType.STRING)
	    	{
	    		String str = sh.getRow(rowsize).getCell(i).getStringCellValue();
	    		System.out.print(str+" ");
	    	}
	    	else if(text==CellType.NUMERIC)
	    	{
	    		double num = sh.getRow(rowsize).getCell(i).getNumericCellValue();
	    		System.out.print(num+" ");
	    	}
	    	else if(text==CellType.BOOLEAN)
	    	{
	    		boolean bo = sh.getRow(rowsize).getCell(i).getBooleanCellValue();
	    		System.out.print(bo+" ");
	    	}
	    	
	    }
	    
		
	}

}
