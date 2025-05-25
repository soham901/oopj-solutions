// 3. WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either 3 or 5. (B)

import java.util.Scanner;

public class P3 {
    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = readArray();

        int sum = 0;
        for (int num : arr) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
