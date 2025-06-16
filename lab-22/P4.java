// 4. Create a class named 'Member' having the following members: (C)
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
// 'Manager' classes have data members 'specialization' and 'department' respectively.
// Now, assign name, age, phone number, address and salary to an employee and a
// manager by making an object of both of these classes and print the same along with
// specialization and department respectively.

public class P4 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.name = "Nattu Kaka";
        mgr.age = 55;
        mgr.phoneNumber = "9876501234";
        mgr.address = "Gokuldham Society";
        mgr.salary = 60000.0;
        mgr.department = "Security";

        Employee emp = new Employee();
        emp.name = "Bagha";
        emp.age = 60;
        emp.phoneNumber = "9123409876";
        emp.address = "Gokuldham Society";
        emp.salary = 45000.0;
        emp.specialization = "Maintenance";

        mgr.displayManagerDetails();
        emp.displayEmployeeDetails();
    }
}

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}
