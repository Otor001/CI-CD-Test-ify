"""
Print a table containing multiplication tables.
"""
# Define the size of the multiplication table
table_size = 10

# Print the header row
print("   ", end="")
for i in range(1, table_size + 1):
    print(f"{i:4}", end="")  # Align numbers in columns
print()

# Print the table rows
for i in range(1, table_size + 1):
    print(f"{i:2} |", end="")  # Row header with a separator
    for j in range(1, table_size + 1):
        print(f"{i * j:4}", end="")
    print()  # New line after each row
