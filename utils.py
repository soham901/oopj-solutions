import os

FOLDER = 'lab-20'

definitions = """1. Write a program in Java to demonstrate use of this keyword. (A)
2. Check whether this can access the Static variables of the class or not.(A)
3. Write a java program static block which will be executed before main ( ) method in a class. Also demonstrate the static method. (B)
4. Create a class "Rectangle" that would contain length and width as an instance variable and count as a static variable. Define constructors [constructor overloading (default, parameterized and copy)] to initialize variables of objects. Define methods to find area and to display variables value of objects which are created. [Note: define initializer block, static initializer block and the static variable and method. Also demonstrate the sequence of execution of initializer block and static initialize block] (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
