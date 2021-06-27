package PracticePrograms;//Based on data in Properties file, compare the CSV file data

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVandPropertiesFile {
    public static void main(String[] args) {
        String csvFile = "G:\\Study\\Reader.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("G:\\Study\\config1.properties");

            prop.load(input);

            int a = Integer.parseInt(prop.getProperty("age"));
            int b = Integer.parseInt(prop.getProperty("salary"));

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {
                    String[] country = line.split(cvsSplitBy);

                      if ((Integer.parseInt(country[1]) > a ) && (Integer.parseInt(country[4]) > b))
                       {
                          System.out.println(country[0] +  " " + country [1] +  " " + country[4]);
                       }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
