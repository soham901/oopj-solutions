// 5. WAP to display all the prime numbers beween the given 2 numbers (C)

#include <stdio.h>

void main() {
    int i, j, start, end, flag;

    printf("Enter the starting number: ");
    scanf("%d", &start);
    printf("Enter the ending number: ");
    scanf("%d", &end);

    for (i = start; i <= end; i++) {
        if (i < 2) {  // Skip numbers less than 2
            continue;
        }
        flag = 1;
        for (j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag) {
            printf("%d ", i);
        }
    }
    printf("\n");
}
