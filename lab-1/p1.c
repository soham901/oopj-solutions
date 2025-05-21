// 1. Calculate average of three numbers

#include <stdio.h>

int main() {
    int num1, num2, num3;
    
    printf("Enter three numbers:\n");
    scanf("%d %d %d", &num1, &num2, &num3);

    float average = (num1 + num2 + num3) / 3.0;

    printf("Average: %.2f\n", average);
}