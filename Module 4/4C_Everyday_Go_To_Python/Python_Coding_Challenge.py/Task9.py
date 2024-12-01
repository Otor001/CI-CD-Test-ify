"""
Return the number of vowels in a string.
"""
def count_vowels(input_string):
    vowels = "aeiouAEIOU"  # List of vowels (both lowercase and uppercase)
    count = 0  # Initialize vowel count

    for char in input_string:
        if char in vowels:  # Check if character is a vowel
            count += 1

    return count

# Example usage
input_string = "Hello World!"
vowel_count = count_vowels(input_string)
print(f"Number of vowels in '{input_string}': {vowel_count}")
