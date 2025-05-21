// 3. WAP to count number of even or odd number from an array of n number. (B)

#include <stdio.h>

void main() {
    int n, i, evens = 0, odds = 0;

    printf("Enter the size: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for (i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) evens++;
        else odds++;
    }

    printf("Number of even numbers: %d\n", evens);
    printf("Number of odd numbers: %d\n", odds);
}
