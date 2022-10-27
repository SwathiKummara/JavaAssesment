package Module12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) {
        File myFile = new File("TextReader.txt");
        try {
            FileWriter fileWriter = new FileWriter("TextReader.txt");
            fileWriter.write("Hi iam swathi .\n welcome to the file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
