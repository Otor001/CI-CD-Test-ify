"""
Create a function that prints out "Hello World"
Invoke the same function in it own body
Invoke the function outside the function block

Take note of the function invoke and put the Python whitespace rule in mind
"""
# Define the function with a limit
def hello_world(counter):
    if counter > 0:
        print("Hello World")
        hello_world(counter - 1)  # Recursive call with decremented counter

# Invoke the function outside the function block
hello_world(5)  # Prints "Hello World" 5 times
