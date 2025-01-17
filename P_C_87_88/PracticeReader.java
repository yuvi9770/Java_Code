package P_C_87_88;

import java.io.FileReader;
import java.io.IOException;

public class PracticeReader {
    public static void main(String[] args) {
        
        String fileName= "Temp-File.txt";

        try(FileReader reader = new FileReader(fileName)){
            int read;
          

            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            System.out.printf("Error occured %s", e.getMessage());
        }
    }
}
