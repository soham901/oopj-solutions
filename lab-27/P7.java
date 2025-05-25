// 7. WAP to demonstrate BufferedInputStream and BufferdOutputStream class. (C)

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P7 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("p7-source.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("p7-destination.txt"));

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bis.close();
            bos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
