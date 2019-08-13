package com.atmecs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel
{
	public static void main (String[] args) throws  IOException
	{
		File excelFile =new File("C:\\Users\\saianusha.podichervu\\Documents\\Book.xlsx");
		FileInputStream fis= new FileInputStream(excelFile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> rowIt=sheet.iterator();
		while (rowIt.hasNext())
		{
			Row row=rowIt.next();
			Iterator <Cell> cellIterator=row.cellIterator();
			while (cellIterator.hasNext())
			{
				Cell cell=cellIterator.next();
				System.out.println(cell.toString()+";");
			}
			
		}
		
		fis.close();	
	}
}
