// 5. WAP to demonstrate BufferedReader and BufferedWriter class. (B)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P5 {
    public static void main(String[] args) {
        String inputFile = "p5-input.txt";
        String outputFile = "p5-output.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            String line;

            System.out.println("Reading from " + inputFile + " and writing to " + outputFile + ":");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Copy complete using BufferedReader and BufferedWriter.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
