"""
Create an abstract class called Vehicle
Create an abstract method called drive_direction()
Create another class Car that inherits from Vehicle
Create another class Plane that inherits from Vehicle
Try running the program and fix the abstract method issues

Optionally instantiate the Car and Plane method, then invoke the drive_direction() in each of the object instances.

Hint: the drive_direction() method in your Car should print "Drive forward", while drive_direction() in your Plane class should print "Drive Upward"
"""
from abc import ABC, abstractmethod

# Define the abstract class Vehicle
class Vehicle(ABC):
    @abstractmethod
    def drive_direction(self):
        pass  # Abstract method that must be implemented by subclasses

# Define the Car class that inherits from Vehicle
class Car(Vehicle):
    def drive_direction(self):
        print("Drive forward")  # Implement the abstract method

# Define the Plane class that inherits from Vehicle
class Plane(Vehicle):
    def drive_direction(self):
        print("Drive upward")  # Implement the abstract method

# Instantiate the Car and Plane classes
car_instance = Car()
plane_instance = Plane()

# Invoke the drive_direction method for each instance
car_instance.drive_direction()  # Output: "Drive forward"
plane_instance.drive_direction()  # Output: "Drive upward"
