package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class IntergrationWithTC {


	
	@Test
	public static String[][] readData(String excelFile) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelFile+".xlsx");
		XSSFSheet sheet = wb.getSheetAt(0); //getsheetAt-index 
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		//step-1
		String[][] data=new String[rowCount][cellCount];

		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <cellCount; j++) {
				String stringCellValue2 = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				//step-2
				//1,0-1,1-1,2-excel sheet
				data[i-1][j]=stringCellValue2;
				//data[0][0]-dataprovider
			}
		}
		wb.close();
		//step-3
		return data;
	}
	
	
	
}
