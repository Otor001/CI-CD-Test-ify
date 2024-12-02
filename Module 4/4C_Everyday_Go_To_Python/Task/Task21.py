"""
Create a class called Human
Add an attribute leg_count with the value of 4
Add a method called get_gender() that returns "Unknown" in the Human class
Create another class called Man that extends Human
Create another class called Woman that extends Human
In the class, Man create the method get_gender() which should return "man"
In the class, Woman create the method get_gender() which should return "woman"
Instantiate the Man and Woman classes
Print out the value of get_gender() from the Man and Woman object instances

"""
# Define the Human class
class Human:
    leg_count = 4  # Attribute for the number of legs

    def get_gender(self):
        return "Unknown"  # Default gender method

# Define the Man class extending Human
class Man(Human):
    def get_gender(self):
        return "man"  # Override the get_gender method for Man

# Define the Woman class extending Human
class Woman(Human):
    def get_gender(self):
        return "woman"  # Override the get_gender method for Woman

# Instantiate the Man and Woman classes
man_instance = Man()
woman_instance = Woman()

# Print out the value of get_gender() for each instance
print(f"Man's gender: {man_instance.get_gender()}")  # Output: "man"
print(f"Woman's gender: {woman_instance.get_gender()}")  # Output: "woman"
