package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	String path = "D:\\Workspace\\eclipse-workspace\\DalalStreet17SeptFramework\\src\\test\\resources\\testData\\TestData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFCell cell;
	XSSFSheet sheet;
	
	public String readData1(String sheet_name,int row_num,int cell_num)
	{
		
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			cell = wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		String data;
		//--------------------------------------------------
		try
		{
			 data =cell.getStringCellValue();
		}
		catch (Exception e)
		{
			double data01 = cell.getNumericCellValue();
			int data1 = (int)data01;
			data = String.valueOf(data1);
		}
		
		return data;
	}
	
	public String readData(String sheet_name,int row_num,int cell_num)
	{
		
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			cell = wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num);
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell);
		
		return data;
	}
	
	public int getRowNumber(String sheet_name)
	{
		
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		int total_rows=sheet.getLastRowNum();
		return total_rows;
	}
	
	public int getCellNumber(String sheet_name,int row_num)
	{
		
		try 
		{
			file = new File(path);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(sheet_name);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		int total_cells = sheet.getRow(row_num).getLastCellNum();
		return total_cells;
	}
}
