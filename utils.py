import os

FOLDER = 'lab-17'

definitions = """1. Create a class “Student” that would contain enrolment No, name, and gender and marks as instance variables ; constructors and display(). Implement constructors to initialize instance variables. (A)
2. Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate the Candidate class. (B)
3. Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. Also create a method GetAccountDetails() and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class. (C)""".split('\n')

# create the directory if it doesn't exist
if not os.path.exists(FOLDER):
    os.makedirs(FOLDER)

# Write each definition to its corresponding Java file
for idx, definition in enumerate(definitions):
    file_path = f'{FOLDER}/P{idx+1}.java'
    with open(file_path, 'w') as fp:
        fp.write(f'// {definition}\n')
