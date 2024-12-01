"""
Sort an array of numbers in descending order.
"""
def sort_descending(numbers):
    return sorted(numbers, reverse=True)

# Example usage
numbers_array = [5, 1, 8, 3, 7]
sorted_array = sort_descending(numbers_array)

print("Original Array:", numbers_array)
print("Sorted Array (Descending):", sorted_array)
