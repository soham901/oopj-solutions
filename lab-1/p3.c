// 3. Calculate simple interest. (principal*roi*time period)/100  (A)

#include <stdio.h>

void main() {
    float principal, roi, time_period, simple_interest;

    printf("Enter the principal amount: ");
    scanf("%f", &principal);

    printf("Enter the rate of interest: ");
    scanf("%f", &roi);

    printf("Enter the time period in years: ");
    scanf("%f", &time_period);

    simple_interest = (principal * roi * time_period) / 100;

    printf("The simple interest is: %.2f\n", simple_interest);
}
