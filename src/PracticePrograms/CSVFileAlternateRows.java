package PracticePrograms;//Printing Alternate Rows (Even or Odd Rows)
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileAlternateRows {
        public static void main(String[] args) {

            String csvFile = "G:\\Study\\Reader.csv";
            BufferedReader br = null;
            String line = "";
            String cvsSplitBy = ",";

            try
            {
                br = new BufferedReader(new FileReader(csvFile));

                for(line =br.readLine();line!=null;line=br.readLine()) {
                    //line =br.readLine();  // 2nd,4th,6th Row
                    for(line =br.readLine();line!=null;line=br.readLine()) {

                        String[] country = line.split(cvsSplitBy);

                        System.out.println(country[0] + " " + country[1] + " " + country[2] + " " + country[3] + " " + country[4]);
                        line =br.readLine();  // 1st,3rd,5th Row

                    }
                }
            }

            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
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

