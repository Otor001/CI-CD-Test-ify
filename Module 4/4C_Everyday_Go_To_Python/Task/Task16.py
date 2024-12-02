"""
Declare a dictionary with any key-value pair of items/elements
Print the dictionary in console
Update the dictionary with two different key-value pair items
Print the dictionary in console again

Note: you can experiment with the other list functions too in the task
"""
# Declare a dictionary with key-value pairs
my_dict = {
    "My Name": "Emmanuel Otor",
    "My Age": 34,
    "My City": "Lagos State",
    "My Nationality": "Nigerian"
}

# Print the original dictionary
print("Dictionary:", my_dict)

# Update the dictionary with two new key-value pairs
my_dict["Occupation"] = "Software Quality Assurance Engineer"
my_dict["Company"] = "SystemSpecs"

# Print the updated dictionary
print("My updated dictionary:", my_dict)

# Accessing a value
print("Name:", my_dict["My Name"])

# Checking if a key exists
if "Age" in my_dict:
    print("Age exists in the dictionary.")

# Removing a key-value pair
removed_value = my_dict.pop("My Nationality")
print("Removed My Nationality:", removed_value)
print("Dictionary after removing 'My Nationality':", my_dict)

# Getting the keys and values
keys = my_dict.keys()
values = my_dict.values()
print("Keys:", list(keys))
print("Values:", list(values))