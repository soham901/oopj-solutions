import os

FOLDER = 'lab-18'

definitions = """1. WAP with following specifications: (A) Class Name: Employee Data Members: Employee_ID, Employee_Name, Designation, Age, Salary Member Functions: GetEmployeeDetails () and DisplayEmpolyeeDetails ().
2. Write a class program with following specifications: (B) Class Name: Student Data Members: Enrollment_No, Student_Name, Semester, CPI and SPI Member Functions: GetStudentDetails () and DisplayStudentDetails ().
3. WAP to create Circle class with area and perimeter function to find area and perimeter of circle. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
