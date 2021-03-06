package com.class32.file;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWritting {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user.dir")+"\\Files\\userData.xlsx";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = excelFile.getSheet("Sheet1");
        Row row=sheet1.getRow(3);
        row.getCell(2).setCellValue("40");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        excelFile.write(fileOutputStream);
    }
}
