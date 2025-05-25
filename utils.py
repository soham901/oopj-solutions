import os

FOLDER = 'lab-14'

definitions = """1. WAP to demonstrate the builtin function of String class ( e.g. length(), charAt(), concat(), indexOf(), equals(), valueOf(), toString(), trim(), substring()) (A)
2. Java String Program to Print even length words. (B)
3. Java String Program to Insert a string into another string. (B)
4. Java String program to check whether a string is a Palindrome (C)
5. Java String Program to Set Characters to a String and get that character from that string. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
