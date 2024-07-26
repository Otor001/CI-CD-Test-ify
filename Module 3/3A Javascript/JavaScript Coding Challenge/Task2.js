// JavaScript Coding Challenge

// Create a length converter function

function convertlength(value, fromUnit, toUnit) {
    let valueInMeter;

    //Convert from the original unit to meters
    if (fromUnit === "meters") {
        valueInMeter = value;
    } else if (fromUnit === "kilometers") {
        valueInMeter = value * 1000;
    } else if (fromUnit === "centimenters") {
        valueInMeter = value / 100;
    } else if (fromUnit === "millimeters") {
        valueInMeter = value / 1000;
    } else {
        return "invalid fromUnit";
    }

    // Convert from meters to the target unit
    if (toUnit === "meters") {
        return valueInMeter;
    } else if (toUnit === "kilometers") {
        return valueInMeter / 1000;
    } else if (toUnit === "centimeters") {
        return valueInMeter * 100;
    } else if (toUnit === "millimeters") {
        return valueInMeter * 1000;
    } else {
        return "invalid toUnit"; 
    }
}

// Sample usage:
let length = 15;
let fromUnit = "meters";
let toUnit = "kilometers";
console.log(length + " " + fromUnit + " is equal to " + convertlength(length, fromUnit, toUnit) + " " + toUnit);

fromUnit = "centimeters";
toUnit = "millimeters";
console.log(length + " " + fromUnit + " is equal to " + convertlength(length, fromUnit, toUnit) + " " + toUnit);