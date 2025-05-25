import os

FOLDER = 'lab-16'

definitions = """1. WAP to demonstrate concept of nested class. (A)
2. WAP to demonstrate anonymous inner class. (B)
3. WAP to demonstrate concepts of auto-boxing and unboxing using wrapper class. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
