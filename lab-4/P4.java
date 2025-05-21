// 4. Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. Note: - 1 pound=.45359237 Kg and 1 inch=.0254 meters (C)

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();
        double inches = scanner.nextDouble();

        // Convert to metric units
        double kg = pounds * 0.45359237;
        double meters = inches * 0.0254;

        // Calculate BMI
        double bmi = kg / (meters * meters);

        System.out.printf("%.2f\n", bmi);

        scanner.close();
    }
}
