package PracticePrograms;//Reading data from .Properties file
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileHandling {
        public static void main(String[] args) {

            try {
                Properties prop = new Properties();
                InputStream input = new FileInputStream("G:\\Study\\config.properties");

                // load a properties file
                prop.load(input);

                // get the property value and print it out
                System.out.println(prop.getProperty("name"));
                System.out.println(prop.getProperty("age"));
                System.out.println(prop.getProperty("address"));
                System.out.println(prop.getProperty("salary"));

            }

            catch (IOException ex)
            {
                ex.printStackTrace();
            }

        }
    }

