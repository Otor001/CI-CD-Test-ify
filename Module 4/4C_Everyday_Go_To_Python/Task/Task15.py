"""
Declare a list with any value and number of item/element
Print the list in console
Sort the list
Print the list in console again

Note: you can experiment with the other list functions too in the task.
"""
my_list = [25, 10, 5, 88, 34, 90, 42, 55]
print("List:", my_list)

# Sort the list
my_list.sort()
print("Sorted list:", my_list)

my_list.append(20)  # Adding an element
print("Append 20:", my_list)

my_list.remove(5)  # Removing an element
print("Remove 5:", my_list)

my_list.reverse()  # Reversing the list
print("Reverse:", my_list)