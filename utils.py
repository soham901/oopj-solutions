import os

FOLDER = 'lab-19'

definitions = """1. Define Time class with hour and minute as data member. Also define addition method to add two-time objects. (A)
2. Define class for Complex number with real and imaginary part. Describe its constructor, overload the constructors and instantiate its object. Also define addition method to add two Complex objects. (B)
3. Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word "quit". Display the total count of each vowel for all sentences. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
