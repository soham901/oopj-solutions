// 3. WAP to demonstrate FileInputStream and FileOutputStream class. (A)

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P3 {
    public static void main(String[] args) {
        String sourceFile = "p3-source.txt";
        String destinationFile = "p3-output.txt";

        try {
            FileOutputStream fos = new FileOutputStream(sourceFile);
            String data = "Hello, this is a test using FileOutputStream!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to " + sourceFile);

            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos2 = new FileOutputStream(destinationFile);

            int byteData;
            System.out.println("Reading from " + sourceFile + " and writing to " + destinationFile + ":");
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
                fos2.write(byteData);
            }

            fis.close();
            fos2.close();

            System.out.println("\nFile copying complete.");

        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
