"""
Sort an array of strings in alphabetical order.
"""
def sort_strings_alphabetically(strings):
    return sorted(strings)  # Use the sorted() function for alphabetical sorting

# Example usage
strings_array = ["banana", "apple", "cherry", "date"]
sorted_array = sort_strings_alphabetically(strings_array)

print("Original Array:", strings_array)
print("Sorted Array:", sorted_array)
