// 3. Convert number of days into year, week & days. [e.g. 375 days = 1 year, 1 week and 3 days] (C)

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int days = (totalDays % 365) % 7;

        System.out.println(years + " years, " + weeks + " weeks, and " + days + " days");
        sc.close();
    }
}
