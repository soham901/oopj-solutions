// 1. WAP with following specifications: (A) Class Name: Employee Data Members: Employee_ID, Employee_Name, Designation, Age, Salary Member Functions: GetEmployeeDetails () and DisplayEmpolyeeDetails ().

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private int age;
    private double salary;

    public void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        sc.nextLine(); // Consume leftover newline
        employeeName = sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void displayEmployeeDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        emp.getEmployeeDetails(sc);
        emp.displayEmployeeDetails();

        sc.close();
    }
}
