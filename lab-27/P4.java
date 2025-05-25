// 4. WAP to Merge the content of two files into single file. (B)

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P4 {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String mergedFile = "merged.txt";

        try (
                FileReader fr1 = new FileReader(file1);
                FileReader fr2 = new FileReader(file2);
                FileWriter fw = new FileWriter(mergedFile);) {
            int c;

            while ((c = fr1.read()) != -1) {
                fw.write(c);
            }

            while ((c = fr2.read()) != -1) {
                fw.write(c);
            }

            System.out.println("Files merged successfully into " + mergedFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
