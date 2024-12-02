"""
Create a class called User
Create a private attribute called __password with the value "password" in the User class
Create a method get_password() that returns self.__password in the User class
Create another class called ActiveUser that inherits from the User class
Create a method get_password() that returns "********" in the ActiveUser class
Instantiate an object of the ActiveUser class
Print the value of get_password() from the object instance
"""
# Define the User class
class User:
    def __init__(self):
        self.__password = "password"  # Private attribute

    def get_password(self):
        return self.__password  # Method to access the private attribute

# Define the ActiveUser class that inherits from User
class ActiveUser(User):
    def get_password(self):
        return "********"  # Override the method to mask the password

# Instantiate an object of the ActiveUser class
active_user_instance = ActiveUser()

# Print the value of get_password() from the object instance
print(active_user_instance.get_password())  # Output: "********"
