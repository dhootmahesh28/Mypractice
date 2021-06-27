package PracticePrograms;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

 /*
    Goto    https://mvnrepository.com/artifact/com.itextpdf/itextpdf/5.5.13
    Download    jar file
    Import into project
    Copy sample.pdf to your project root folder
    Run below program
 */

        public class PDFfileHandling {

            public static void main(String args[]) throws Exception{

               PdfReader reader = new PdfReader("G:\\Study\\Draft.pdf");

                for(int i=1; i <= 4; i++)
                {
                String textFromPage = PdfTextExtractor.getTextFromPage(reader,i);
                System.out.println(textFromPage);
                }

                reader.close();


            }

        }


