// 2. WAP that calculates area of circle, triangle and square using method overloading. (B)

#include <stdio.h>
#include <math.h>

float area_circle(float radius) {
    return 3.14159 * radius * radius;
}

float area_triangle(float base, float height) {
    return 0.5 * base * height;
}

float area_square(float side) {
    return side * side;
}

void main() {
    float r = 5.0, b = 4.0, h = 3.0, s = 6.0;

    printf("Area of Circle: %.2f\n", area_circle(r));
    printf("Area of Triangle: %.2f\n", area_triangle(b, h));
    printf("Area of Square: %.2f\n", area_square(s));
}
