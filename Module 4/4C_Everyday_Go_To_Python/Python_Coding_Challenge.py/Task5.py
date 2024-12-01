"""
Create a function that reverses an array
"""
def reverse_array(arr):
    return arr[::-1]  # Using slicing to reverse the array

# Example usage
original_array = [1, 2, 3, 4, 5]
reversed_array = reverse_array(original_array)

print("Original Array:", original_array)
print("Reversed Array:", reversed_array)
