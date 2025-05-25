import os

FOLDER = 'lab-15'

definitions = """1. WAP to demonstrate the builtin function of Math class ( e.g. min(), max(), random(), pow(), sqrt(), round(), ceil(), floor(), abs()) (A)
2. WAP to print the largest number from the three given number using Math class function. (B)
3. WAP to check that weather the given number is Armstrong or not using Math class function. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
