package com.TestNGDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D10WriteToExcel {
	String fPath = "";
	File file ;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void writeToExcel() {
	  row = sheet.createRow(0);       //Create 1st Row
	  cell = row.createCell(0);       //Create 1st cell in 1st row
	  cell.setCellValue("Welcome");   //Add the data inside cell
  }
  @BeforeTest
  public void beforeTest() {
	  
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkook();				//
	  sheet = wb.createSheet("My Sheet");
  }

  @AfterTest
  public void afterTest() {
  }

}
