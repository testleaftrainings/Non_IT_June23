package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		//step 1- set path workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
//step 2- get into the sheet
		//wb.getSheet("sheet1"); //string
		XSSFSheet sheet = wb.getSheetAt(0); //getsheetAt-index 
//step 3-get into row
		int rowCount = sheet.getLastRowNum();
		System.out.println("total number row :"+ rowCount);
//to get all row in excel
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows :"+physicalNumberOfRows);
		
//step 4-total number columns(cell)
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println("total number cell : "+cellCount);
//read data from excel
		String stringCellValue = sheet.getRow(2).getCell(2).getStringCellValue();
		System.out.println(stringCellValue);
		System.out.println("**************************");
		//1,2,3
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			//0,1,2,3,=
			for (int j = 0; j <cellCount; j++) {
				String stringCellValue2 = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
			}
		}
		
	}

}
