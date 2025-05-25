import java.util.Scanner;

import exam.Result;

public class MarkSheetGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Result[] results = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            System.out.print("Enter student name: ");
            String name = sc.next();
            System.out.print("Enter marks for subject 1: ");
            int subject1 = sc.nextInt();
            System.out.print("Enter marks for subject 2: ");
            int subject2 = sc.nextInt();
            System.out.print("Enter marks for subject 3: ");
            int subject3 = sc.nextInt();

            System.out.println("-------------------------------------");

            results[i] = new Result(id, name, subject1, subject2, subject3);
        }

        System.out.println("\nMark Sheets:");
        for (Result result : results) {
            result.displayMarkSheet();
        }

        sc.close();
    }
}
