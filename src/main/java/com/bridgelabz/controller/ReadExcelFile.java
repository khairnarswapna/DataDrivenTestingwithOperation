package com.bridgelabz.controller;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadExcelFile implements IAutoConstant {

  //  public static Workbook wb1;
    public static String getProperty(String CONFIG_PATH, String key) {
        String property = "";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(CONFIG_PATH));
            property = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return property;
    }

    XSSFWorkbook wb;
    XSSFSheet sheet;
    public ReadExcelFile(String excelPath)
    {
        try
        {
            File src = new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetnumber, int row, int column)
    {
        sheet = wb.getSheetAt(sheetnumber);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
    public int getRowCount(int sheetIndex)
    {
        int row = wb.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

}
