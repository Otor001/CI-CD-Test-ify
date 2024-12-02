"""
Create a function that filters out negative numbers.
"""
def filter_negative_numbers(numbers):
    return [num for num in numbers if num >= 0]

# Example usage
numbers_list = [-10, 15, -3, 20, 0, -7, 8]
filtered_list = filter_negative_numbers(numbers_list)

print("Original List:", numbers_list)
print("Filtered List (No Negatives):", filtered_list)
