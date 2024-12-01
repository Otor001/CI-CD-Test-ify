"""
1 Declare a string variable with any value

2 Print out the string in the upper case form


Note: you can experiment with the other functions call too in the task.
"""

Project = "Testify Academy is a software Testing School, where both Manual and Automation Aspect of testing are conducted, we were taught varieties of topics that ranges from CI/CD Pipelines, how to create repository and push to Github Actions, Java, JavaScript, API Testing, Python and Web Test Automation Testing With Selenium and so much more!. The learning experience was rigorous, tasky, and impactful as a whole."

# Upper case form
Uppercase_Project = Project.upper()
print("Uppercase: ", Uppercase_Project)

# Capitalize form
Capitalize_Project = Project.capitalize()
print("Capitalize: ", Capitalize_Project)

# Length form
Size = len(Project)
print("Size: ", Size)

# Count form
Count_Project = Project.count("to")
print("Count: ", Count_Project)

# Left Strip form
lstrip_Project = Project.lstrip("The Testify Automation School,")
print("Left strip: ", lstrip_Project)

# Split form
Split_Project = Project.split(",")
print("Split: ", Split_Project)