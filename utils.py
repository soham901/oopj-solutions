import os

FOLDER = 'lab-22'

definitions = """1. Demonstrate the Method overriding using example. (A)
2. Demonstrate the use of Super Keyword to access constructor, function and variable of immediate parent class from the subclass . (A)
3. Demonstrate the use of Final Keyword to prevent function overriding, variable modification and extraction of a class in sub class. (B)
4. Create a class named 'Member' having the following members: (C)
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an employee and a
manager by making an object of both of these classes and print the same along with
specialization and department respectively.""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
