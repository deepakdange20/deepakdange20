package co.atuo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path = "C:\\Users\\Smart\\Desktop\\A\\data.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Data");
		int rowcount =sheet.getLastRowNum();
		int colCount =sheet.getRow(1).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colCount);
		
		
		for(int i=0;i<rowcount;i++)
		{
				for(int j=0;j<colCount;j++)
					{
						Cell cell = sheet.getRow(i).getCell(j);
						System.out.print(cell);
						System.out.print(", ");
					}
					System.out.println();
					
		}
		
		//String aa= WorkbookFactory.create(file).getSheet("Data").getRow(1).getCell(1).getStringCellValue();
		
	//	System.out.println(aa);

	}

}
