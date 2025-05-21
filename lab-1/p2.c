// 2. Find area of circle. (pie*r*r) (A)

#include <stdio.h>

void main() {
    float r;
    const float pi = 3.14;

    printf("Enter the radius of the circle: ");
    scanf("%f", &r);

    float area = pi * r * r;

    printf("The area of the circle is: %.2f\n", area);
}
