// 1. Write a java program to create a file to the specified location. (Use File Class) (A)

import java.io.File;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        try {
            // get current working directory
            String currentDirectory = System.getProperty("user.dir");
            File file = new File(currentDirectory + "/source.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
