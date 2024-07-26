// Sort an array of numbers in descending order

function sortArrayDescending(arr) {
    return arr.sort((a, b) => b - a);
}

// Sample usage
let numberArray = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5];
let sortedArray = sortArrayDescending(numberArray);
console.log('Original Array:', numberArray);
console.log('Sorted Array:', sortedArray);
