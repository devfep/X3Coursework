package unit2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public CreateFile(){
        try{
            File salesData = new File("salesData.txt");
            if (salesData.createNewFile()){
                System.out.printf("File created: %s\n", salesData.getName());
            } else {
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("An error occurred");
        }
    }
}
