import os

FOLDER = 'lab-20'

definitions = """1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance. (A)
2. Create a class named shape. In this class, we have three subclasses circle, triangle and square. WAP to display area of all three classes. (B)
3. WAP for implementing single inheritance which creates one class account_details for getting account information and another class interest for calculating and displaying total interest from the data inserted from account details. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
