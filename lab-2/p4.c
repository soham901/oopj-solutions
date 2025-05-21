// 4. WAP to create following patterns. (C)

#include <stdio.h>

void firstPattern() {
    const int n = 3;

    for(int i = 1; i <= n; i++) {
        for(int j = 0; j < n - i; j++) printf(" ");
        for(int k = 0; k < i; k++) printf("* ");
        printf("\n");
    }

    for(int i = n - 1; i >= 1; i--) {
        for(int j = 0; j < n - i; j++) printf(" ");
        for(int k = 0; k < i; k++) printf("* ");
        printf("\n");
    }
}

void secondPattern() {
    for (int i = 5; i >= 1; i--) {
        for (int j = 5; j >= 6 - i; j--) {
            printf("%d", j);
        }
        printf("\n");
    }
}

void main() {
    firstPattern();
    printf("\n\n");
    secondPattern();
}
