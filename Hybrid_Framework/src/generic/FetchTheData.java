package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTheData
{
	public static String getData(String sh,int r,int c)
	{
		String value=null;
		
		try 
		{
			FileInputStream fis=new FileInputStream("./Excel/TestData1.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			
			Sheet sheet=book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			
			value=cell.toString();
		} 
		catch (EncryptedDocumentException | IOException e) 
		{
			
			e.printStackTrace();
		}
		return value;
	}
}
