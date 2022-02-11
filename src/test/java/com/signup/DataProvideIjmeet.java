package com.signup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProvideIjmeet {


	
	@DataProvider(name="excel-data")
	
	
	public Object[][] enterName() throws Exception
	{
		Object[][] obj=null;
		FileInputStream fis=new FileInputStream("C:\\Users\\Shree\\Desktop\\LoginData.xlsx");
	 	XSSFWorkbook book=new XSSFWorkbook(fis);
	 	XSSFSheet sheet= book.getSheet("EmailId");
	 	int rows=sheet.getLastRowNum();
	 	obj=new Object[rows][sheet.getRow(0).getLastCellNum()-1];
	 			for (int i = 1; i <=rows; i++) {
					XSSFRow row=sheet.getRow(i);
					int cells=row.getLastCellNum();
					for (int j = 1; j < cells; j++) {
						Cell cell=row.getCell(j);
						 switch(cell.getCellType())
						 {
						 case STRING:obj[i-1][j-1]=cell.getStringCellValue();
						              break;
						 case NUMERIC:obj[i-1][j-1]=(int)cell.getNumericCellValue();
			                          break;
						 case BLANK:obj[i-1][j-1]="";
		                               break;
		                  default:System.err.println("Invalid data in excel");
		               
						    
					}
						
					}
				}
	 	
	 			book.close();
				return obj;
	}
}
