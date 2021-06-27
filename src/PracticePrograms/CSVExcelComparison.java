package PracticePrograms;// Compare CSV & EXCEL file and show data if there is difference between them

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

import static com.sun.xml.bind.v2.schemagen.Util.equal;


public class CSVExcelComparison {
    private static final String FILE_NAME = "G:\\Study\\sample1.xlsx";

    public static void main(String[] args) throws IOException {

        String csvFile = "G:\\Study\\Reader.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int a = 0;
        int b = 0;

        FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
        XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        br = new BufferedReader(new FileReader(csvFile));
        int c = sheet.getLastRowNum();


        for (a = 0; a < c; a++) {
            line = br.readLine();
            String[] country = line.split(cvsSplitBy);
            //System.out.println(country[0] + " " + country[1] + " " + country[2] + " " + country[3] + " " + country[4]);

            Row row = (XSSFRow) rowIterator.next();
            int d = row.getLastCellNum();
            Iterator<Cell> cellIterator = row.cellIterator();
            for (b = 0; b < d; b++) {

                Cell cell = row.getCell(b);
                String[][] excelData = new String[c][d];
                String value = String.valueOf(cell);
                excelData[a][b] = value;
                if (equal(excelData[a][b], country[b])) {
                    System.out.println("");
                }
                else{
                    System.out.println(country[b]);
                    System.out.println(excelData[a][b]);

                }
            }

            System.out.println("");
        }
        workbook.close();

    }
}











