"""
Create a length converter function
"""
def length_converter(value, from_unit, to_unit):
    # Conversion rates to meters
    conversion_to_meters = {
        "meters": 1,
        "kilometers": 1000,
        "miles": 1609.34,
        "feet": 0.3048,
        "inches": 0.0254,
    }
    
    # Ensure the units are valid
    if from_unit not in conversion_to_meters or to_unit not in conversion_to_meters:
        raise ValueError("Invalid units. Valid units are: meters, kilometers, miles, feet, inches.")

    # Convert the input value to meters
    value_in_meters = value * conversion_to_meters[from_unit]

    # Convert from meters to the desired unit
    converted_value = value_in_meters / conversion_to_meters[to_unit]

    return converted_value

# Example usage
value = 5  # Length to convert
from_unit = "meters"  # Unit to convert from
to_unit = "feet"  # Unit to convert to

result = length_converter(value, from_unit, to_unit)
print(f"{value} {from_unit} is equal to {result:.2f} {to_unit}")
