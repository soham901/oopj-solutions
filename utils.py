import os

FOLDER = 'lab-12'

definitions = """1. WAP that create an array, take the size of array from the user, take the array member from the user and display it using loop. (A)
2. WAP to count number of even or odd number from an array of n number. (A)
3. WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either 3 or 5. (B)
4. WAP to accept n numbers in an array. Now, enter a number and search whether the number is present or not in the list of array elements by using linear search. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
