package PracticePrograms;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/*
Goto
https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-4.1.0-20190412.zip
Download from any mirror
Unzip
Import all jars from each folder
Open only MS Office 2013 onwards to create sample.xml file
Run below program
*/

       public class InputExcelFileHandling{
             private static final String FILE_NAME = "G:\\Study\\sample.xlsx";

             public static void main(String[] args) throws Exception {
                 FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
                 XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
                 XSSFSheet datatypeSheet = workbook.getSheetAt(0);
                 for (int m = 0; m < datatypeSheet.getLastRowNum(); m++){
                     XSSFRow row = datatypeSheet.getRow(m);
                     for (int k=0 ; k< row.getLastCellNum(); k++){
                         System.out.print(row.getCell(k));
                         System.out.print(" ");
                     }
                     System.out.println();
                 }
                 workbook.close();

             }

         }