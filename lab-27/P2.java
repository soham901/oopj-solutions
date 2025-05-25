// 2. WAP to copy the content of one file to another file and console. (Use FileReader and File Writer Class) (A)

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P2 {
    public static void main(String[] args) {
        // get current working directory
        String currentDirectory = System.getProperty("user.dir");
        File source = new File(currentDirectory + "/source.txt");
        File destination = new File(currentDirectory + "/destination.txt");

        try (FileReader fr = new FileReader(source);
                FileWriter fw = new FileWriter(destination)) {

            int ch;
            System.out.println("Content copied to console and file:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                fw.write(ch);
            }

            System.out.println("\nCopy operation completed.");
        } catch (IOException e) {
            System.out.println("Error during file operations:");
            e.printStackTrace();
        }
    }
}
