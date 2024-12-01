"""
Declare a global variable with name as language and the value as "Python"
Create a function, in the function declare a variable with name as language and value as "Java", then print out the variable in the function
Print out the variable name into the console
Invoke the function
"""
# Declare a global variable
language = "Python"

# Define a function
def change_language():
    # Declare a local variable with the same name
    language = "Java"
    print(f"Local variable is: {language}")

# Invoke the function
change_language()

# Print the global variable
print(f"Global variable is: {language}")
