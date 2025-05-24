import os

FOLDER = 'lab-9'

definitions = """1. WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3. (A)
2. WAP to find factorial of the given number. (A)
3. WAP to find whether the given number is prime or not without using function. (B)
4. WAP to print given number in reverse order. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
