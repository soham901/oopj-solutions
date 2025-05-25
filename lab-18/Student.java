// 2. Write a class program with following specifications: (B) Class Name: Student Data Members: Enrollment_No, Student_Name, Semester, CPI and SPI Member Functions: GetStudentDetails () and DisplayStudentDetails ().

import java.util.Scanner;

public class Student {
    private int enrollmentNo;
    private String studentName;
    private int semester;
    private double cpi;
    private double spi;

    public void getStudentDetails(Scanner sc) {
        System.out.print("Enter Enrollment No: ");
        enrollmentNo = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Semester: ");
        semester = sc.nextInt();

        System.out.print("Enter CPI: ");
        cpi = sc.nextDouble();

        System.out.print("Enter SPI: ");
        spi = sc.nextDouble();
    }

    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Student Name: " + studentName);
        System.out.println("Semester: " + semester);
        System.out.println("CPI: " + cpi);
        System.out.println("SPI: " + spi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.getStudentDetails(sc);
        student.displayStudentDetails();

        sc.close();
    }
}
