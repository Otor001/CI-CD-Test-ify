"""
Create a class called Human

Add an attribute leg_count with the value of 4

Add a method called get_gender() that returns "Unknown" in the Human class

Create another class called Man that extends Human


Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance

"""
# Define the Human class
class Human:
    leg_count = 4  # Attribute with a default value of 4

    def get_gender(self):
        return "Unknown"  # Default gender method

# Define the Man class extending Human
class Man(Human):
    def get_gender(self):
        return "Male"  # Override the get_gender method

# Define the Woman class extending Human
class Woman(Human):
    def get_gender(self):
        return "Female"  # Override the get_gender method

# Instantiate the classes
man = Man()
woman = Woman()

# Print the get_gender() method result for each instance
print(f"Man's gender: {man.get_gender()}")  # Output: Male
print(f"Woman's gender: {woman.get_gender()}")  # Output: Female

# Print the leg_count attribute
print(f"Man's leg count: {man.leg_count}")  # Output: 4
print(f"Woman's leg count: {woman.leg_count}")  # Output: 4
