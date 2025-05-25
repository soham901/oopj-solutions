// 1. Write a program in Java to demonstrate use of this keyword. (A)

import java.util.Scanner;

public class P1 {
    private int id;
    private String name;

    public P1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and Name:");
        int id = sc.nextInt();
        String name = sc.next();
        P1 obj = new P1(id, name);
        obj.display();
        sc.close();
    }
}
