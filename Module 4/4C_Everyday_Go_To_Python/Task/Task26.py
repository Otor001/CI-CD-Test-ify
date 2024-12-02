"""
Create a test case that compares two strings
Create another test case that compares different numbers

Use any unit testing framework from this week's lessons.
"""
import unittest

# Create a test case class inheriting from unittest.TestCase
class TestComparisons(unittest.TestCase):
    # Test case for comparing two strings
    def test_compare_strings(self):
        string1 = "Testify Python"
        string2 = "Testify Python"
        self.assertEqual(string1, string2, "The strings do not match.")

    # Test case for comparing different numbers
    def test_compare_numbers(self):
        number1 = 42
        number2 = 24
        self.assertNotEqual(number1, number2, "The numbers should not match.")

# Run the tests
if __name__ == '__main__':
    unittest.main()

