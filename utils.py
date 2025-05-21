import json

# Read definitions from a JSON file
with open('definitions.json', 'r') as json_file:
    definitions = json.load(json_file)

# Ensure definitions is a list
if not isinstance(definitions, list):
    raise ValueError("JSON must contain a list of definitions.")

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'lab-4/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
