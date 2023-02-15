package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	public ExcelHandling() throws IOException
	{
		String path = "C:\\Users\\Admin\\Desktop\\QA work\\DemoDalalStreet\\DalalStreet17Sepframwork\\src\\test\\resources\\testData\\Project Data.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFCell cell = wb.getSheet(path).getRow(0).getCell(0);

	}

}
