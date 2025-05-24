// 2. Modify program number 2 of Lab number 6. Calculate grade of a student depending on percentage. (If >90% then A+ grade, 80-90% then A grade, 70-80% then B+ grade, 60-70% then B grade, 50-60% then C grade, 35-50% then P grade and <35 then FT) (A)

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the percentage of the student: ");
        double percentage = sc.nextDouble();
        String grade;

        if (percentage > 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 35) {
            grade = "P";
        } else {
            grade = "FT";
        }

        System.out.println("The grade of the student is: " + grade);
        sc.close();
    }
}
