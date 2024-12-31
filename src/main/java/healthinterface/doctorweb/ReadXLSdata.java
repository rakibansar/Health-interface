package healthinterface.doctorweb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadXLSdata {
	

	@DataProvider(name = "crendata")
	public String[][] getData( Method m) throws IOException
	{
		String excelsheetname = m.getName();
//		File f = new File(System.getProperty("C:\\Users\\Rakib Ansar\\eclipse-project\\new1\\datatest\\Testdata.xlsx"));
		File f = new File("C:\\Users\\Rakib Ansar\\eclipse-workspace\\doctorweb\\src\\test\\Test data\\Testdata\\Testdata (2).xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelsheetname);

		int totalrows = sheetname.getLastRowNum();
		System.out.println(totalrows);
		Row rowcells = sheetname.getRow(0);
		int totalcols = rowcells.getLastCellNum();
		System.out.println(totalcols);
		
		DataFormatter format = new DataFormatter();
		
		String testData[][] = new String[totalrows][totalcols];
		for(int i=1; i<=totalrows; i++) { 
			for(int j=0;j<totalcols;j++) {  
				testData[i-1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j)); 
				System.out.println(testData[i-1][j]);
			}

			}
		return testData;
			
		}
			
	}

	
