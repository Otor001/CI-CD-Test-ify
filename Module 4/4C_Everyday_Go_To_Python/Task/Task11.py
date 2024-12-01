"""
Create a function that accepts two numbers, adds the numbers and prints out the result in the console.

Create a function that return the string value "Testify Python"

Invoke/call the two functions

"""
# Function to accept two numbers, add them, and print the result
def add_numbers(num1, num2):
    result = num1 + num2
    print(f"The sum of {num1} and {num2} is: {result}")

# Function to return the string "Testify Python"
def get_string():
    return "Testify Python"

# Invoke the functions
# Call the add_numbers function
add_numbers(2, 4)

# Call the get_string function and print the result
string_result = get_string()
print(string_result)
