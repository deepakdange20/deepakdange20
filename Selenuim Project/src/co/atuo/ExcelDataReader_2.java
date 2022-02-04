package co.atuo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelDataReader_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file = null;
		try
		{
			 file = new FileInputStream("C:\\Users\\Smart\\Desktop\\A\\data.xlsx");
		}
		catch (FileNotFoundException e)
		{

			e.getMessage();
			System.out.println("File not found");
		}
		
		Sheet sheet =WorkbookFactory.create(file).getSheet("Data");
		String cellDate=	sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(cellDate);
		
		for (int i = 0; i < sheet.getLastRowNum(); i++)
		{
			for (int j = 0; j <sheet.getRow(1).getLastCellNum(); j++) 
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
	
	}

}
