// Return the number of vowels in a string

function countVowels(str) {
    // Convert the string to lowercase to handle both uppercase and lowercase letters
    str = str.toLowerCase();
    
    // Define a set of vowels
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    
    // Initialize a counter for the vowels
    let count = 0;
    
    // Iterate through each character in the string
    for (let char of str) {
        // Check if the character is a vowel
        if (vowels.includes(char)) {
            count++;
        }
    }
    
    // Return the count of vowels
    return count;
}

// Sample usage
let inputString = "Hello, World!";
let vowelCount = countVowels(inputString);
console.log(`The number of vowels in "${inputString}" is:`, vowelCount);
