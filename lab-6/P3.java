// 3. WAP to read marks of five subjects calculate total and percentage. (A)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for five subjects:");
        double[] marks = new double[5];
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextDouble();
            total += marks[i];
        }
        double percentage = (total / (marks.length * 100)) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        sc.close();
    }
}
