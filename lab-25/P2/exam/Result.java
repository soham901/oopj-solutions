package exam;

import student.Student;

public class Result extends Student {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public Result(int rollNumber, String name, int subject1Marks, int subject2Marks, int subject3Marks) {
        super(rollNumber, name);
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public int calculateTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    public double calculateAverageMarks() {
        return (double) calculateTotalMarks() / 3;
    }

    public void displayMarkSheet() {
        System.out.println("\n--- Mark Sheet ---");
        displayStudentInfo();
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.printf("Average Marks: %.2f\n", calculateAverageMarks());
        System.out.println("-----------------");
    }
}
