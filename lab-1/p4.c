// 4. WAP to find factorial of the given number (using simplest method)

#include <stdio.h>

void main() {
    int n, i, fact = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (n < 0) {
        printf("Factorial is not defined for negative numbers\n");
    } else {
        for (i = 1; i <= n; i++) {
            fact *= i;
        }
        printf("Factorial of %d = %d\n", n, fact);
    }
}
