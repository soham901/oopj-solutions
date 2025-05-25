// 1. Create a class “Student” that would contain enrolment No, name, and gender and marks as instance variables ; constructors and display(). Implement constructors to initialize instance variables. (A)

class Student {
    private int eNo;
    private String name;
    private boolean gender;
    private double marks;

    public Student(int eNo, String name, boolean gender, double marks) {
        this.eNo = eNo;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Enrolment No: " + eNo);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + (gender ? "Male" : "Female"));
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student = new Student(12345, "Jethalal Gada", true, 77.77);
        student.display();
    }
}
