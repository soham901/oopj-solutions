import os

FOLDER = 'lab-7'

definitions = """1. WAP to check whether the given number is positive or negative. (A)
2. Modify program number 2 of Lab number 6. Calculate grade of a student depending on percentage. (If >90% then A+ grade, 80-90% then A grade, 70-80% then B+ grade, 60-70% then B grade, 50-60% then C grade, 35-50% then P grade and <35 then FT) (A)
3. Convert number of days into year, week & days. [e.g. 375 days = 1 year, 1 week and 3 days] (C)
4. WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants. (B)
5. WAP to find out largest number from given three numbers without using Logical Operator.(C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
