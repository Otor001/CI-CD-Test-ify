// Create a function that filters out negative numbers

function filterNegativeNumbers(arr) {
    return arr.filter(num => num >= 0);
}

// Sample usage
let numberArray = [3, -1, 4, -1, 5, -9, 2, -6, 5, 3, 5];
let filteredArray = filterNegativeNumbers(numberArray);
console.log('Original Array:', numberArray);
console.log('Filtered Array:', filteredArray);
