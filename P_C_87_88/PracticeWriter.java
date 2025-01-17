package P_C_87_88;

import java.io.FileWriter;
import java.io.IOException;

public class PracticeWriter {
    
    public static void main(String[] args){
        
        String fileName= "Temp-File.txt";
        try(FileWriter writer = new FileWriter (fileName)){   //Automatically close the writer. It is known as try with resource
            writer.write("Hello\n"); 
            for (int i = 0; i <100 ; i++) {
                writer.write("*\n");
            }                  
            writer.flush();
            System.out.println("File Written Successfully");
            
        }catch(IOException exception){
            System.out.printf("Exception Occured %s",
            exception.getMessage());
        }
    }
}
