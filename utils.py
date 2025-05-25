import os

FOLDER = 'lab-13'

definitions = """1. WAP to read values in two-dimensional array and print them in matrix form. (A)
2. WAP to print the score card of cricket match using the two dimensional array. Take all the input regarding score card from the user. (B)
3. WAP to read two matrices of size n X n, perform multiplication operation and store result in third matrix and print it. (C)
4. WAP to store numbers in 4 X 4 matrix in a two-dimensional array. Find the sum of the numbers of each row and the sum of numbers of each column of the matrix.(C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
