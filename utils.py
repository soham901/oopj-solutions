import os

FOLDER = 'lab-8'

definitions = """1. WAP to make a Simple Calculator using switch...case. (A)
2. WAP that prompts the user to input number of calls and calculate the monthly telephone bills as per the following rule: (B) Minimum Rs. 200 for up to 100 calls. Plus Rs. 0.60 per call for next 50 calls. Plus Rs. 0.50 per call for next 50 calls. Plus Rs. 0.40 per call for any call beyond 200 calls.
3. Three sides of a triangle are entered through the keyboard. WAP to check whether the triangle is isosceles, equilateral, scalene or right-angled triangle. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
