"""
Print all even numbers from 0 - 100
"""

# Loop through numbers from 0 to 100
for number in range(0, 101):  # The range includes 0 and excludes 101
    if number % 2 == 0:  # Check if the number is even
        print(number)
