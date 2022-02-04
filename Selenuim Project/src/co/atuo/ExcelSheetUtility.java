package co.atuo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				allValueFromExcel();
	}

	public static void allValueFromExcel()
	{
		FileInputStream ip = null ;
		Sheet s = null;
		try 
		{

			ip = new FileInputStream("C:\\Users\\mahesh\\eclipse-workspace\\Selenuim Project\\src\\excelsheet\\HrmOrange.xlsx");
		} 
		catch (FileNotFoundException e)
		{
			try
			{
			ip = new FileInputStream("D:\\eclipse-workspace\\WebSite\\src\\main\\java\\com\\orange\\excelsheets\\HrmOrange.xlsx");
			} catch (FileNotFoundException e1) {
				System.out.println("File not found");

			}
		}
		
		try {
			 s= WorkbookFactory.create(ip).getSheet("ADDEMPLOYEE");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	int row=s.getLastRowNum();
	int col=s.getRow(1).getLastCellNum();
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j <col ; j++) {
			System.out.println(getDataFromExcelSheet(i,j));
			}
		}
	}
	public static String getDataFromExcelSheet(int row ,int col)
	{
		FileInputStream ip = null ;
		Sheet s = null;
		String data;
		try 
		{

			ip = new FileInputStream("C:\\Users\\mahesh\\eclipse-workspace\\Selenuim Project\\src\\excelsheet\\HrmOrange.xlsx");
		} 
		catch (FileNotFoundException e)
		{
			try
			{
			ip = new FileInputStream("D:\\eclipse-workspace\\WebSite\\src\\main\\java\\com\\orange\\excelsheets\\HrmOrange.xlsx");
			} catch (FileNotFoundException e1) {
				System.out.println("File not found");

			}
		}
		
		try {
			 s= WorkbookFactory.create(ip).getSheet("ADDEMPLOYEE");
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		data = s.getRow(row).getCell(col).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double value = s.getRow(row).getCell(col).getNumericCellValue();
			data = Double.toString(value);
		}
		return data;
		
	}
}
