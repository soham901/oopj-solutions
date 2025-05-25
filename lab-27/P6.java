// 6. WAP to Copy the content of one file into multiple file. (C)

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P6 {
    public static void main(String[] args) {
        String sourceFile = "p6-source.txt";
        String[] destinationFiles = { "p6-copy1.txt", "p6-copy2.txt", "p6-copy3.txt" };

        try (FileReader fr = new FileReader(sourceFile)) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }

            for (String dest : destinationFiles) {
                try (FileWriter fw = new FileWriter(dest)) {
                    fw.write(content.toString());
                } catch (IOException e) {
                    System.out.println("Error writing to " + dest + ": " + e.getMessage());
                }
            }

            System.out.println("Content copied to all files successfully!");

        } catch (IOException e) {
            System.out.println("Error reading source file: " + e.getMessage());
        }
    }
}
