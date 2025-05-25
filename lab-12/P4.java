// 4. WAP to accept n numbers in an array. Now, enter a number and search whether the number is present or not in the list of array elements by using linear search. (C)

import java.util.Scanner;

public class P4 {
    public static int[] readArray(Scanner sc) {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = readArray(sc);

        System.out.print("Enter a number to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + target + " is present in the array.");
        } else {
            System.out.println("Number " + target + " is not present in the array.");
        }

        sc.close();
    }
}
