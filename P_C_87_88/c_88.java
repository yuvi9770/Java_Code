package P_C_87_88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class c_88 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of file: ");
        String filename = input.next();

        try(FileReader reader = new FileReader(filename)) {

            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }  
        } catch(FileNotFoundException e){
            System.out.printf("%s not found", filename);

        }catch (IOException e) {
          System.out.printf("Exception occured %s",
                                e.getMessage());  
        }
        input.close();
    }
}
