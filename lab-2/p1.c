// 1. WAP to generate Fibonacci series of N given number using method (A)

#include <stdio.h>

void main() {
    int n, i, a = 0, b = 1, c;

    printf("Enter the number of terms in the Fibonacci series: ");
    scanf("%d", &n);

    printf("Fibonacci series: ");
    for (i = 0; i < n; i++) {
        if (i <= 1) {
            c = i;
        } else {
            c = a + b;
            a = b;
            b = c;
        }
        printf("%d ", c);
    }
    printf("\n");
}
