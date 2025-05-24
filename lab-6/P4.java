// 4. Convert seconds into hours, minutes & seconds and print in HH:MM:SS. [e.g. 10000 seconds = 02:46:40)] (B)

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalSec = sc.nextInt();

        int hrs = totalSec / 3600;
        int remSec = totalSec % 3600;
        int mins = remSec / 60;
        int secs = remSec % 60;

        System.out.printf("Time in HH:MM:SS format: %02d:%02d:%02d%n", hrs, mins, secs);

        sc.close();
        // Example output: 10000 seconds = 02:46:40
    }
}
