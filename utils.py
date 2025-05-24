import json
import os

FOLDER = 'lab-6'

# Read definitions from a JSON file
with open('definitions.json', 'r') as json_file:
    definitions = json.load(json_file)

# Ensure definitions is a list
if not isinstance(definitions, list):
    raise ValueError("JSON must contain a list of definitions.")

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
