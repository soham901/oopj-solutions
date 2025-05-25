import os

FOLDER = 'lab-11'

definitions = """1. WAP to calculate simple interest using method. (A)
2. WAP to find maximum number from given three numbers using method. (A)
3. WAP that calculates area of circle, triangle and square using method overloading. (A)
4. WAP to generate Fibonacci series of N given number using method. (B)
5. Write a method with following method header: public int gcd (int num1, int num2). Write a program that prompts the user to enter two integers and compute the gcd of two integers. [Note: The greatest common divisor (GCD) of two numbers is the largest number that divides them both.] (B)
6. WAP to accept a number and check whether the number is prime or not. Use method name check (int n). The method returns 1, if the number is prime otherwise, it returns 0. (C)
7. WAP to find the factorial of given number using recursion. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
