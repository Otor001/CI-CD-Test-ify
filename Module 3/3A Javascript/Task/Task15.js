// My Personal Library 3
// Task

// You now have more books in your library. You should manage them all in one place. 
// Any idea how you can achieve that?... Arrays!

// Create a books array. 

// Each element of this array will be a book object. 

// Each book object will have the following properties

// title (string)

// description (string)

// numberOfPages (number)

// authour (string)

// reading (boolean)

// Use a for-loop to loop through the books array and log all books where the reading status is true to the console


const booksArray = [
    {
    name: 'book',
    title: 'Test Automation',
    description: 'Mastering Automation',
    numberOfPages: 250,
    author: 'Otor Emmanuel',
    reading: true,
        },
        {
            name: 'book',
            title: 'CI/CD Pipeline Testify',
            description: 'How to automate the CI/CD pipeline with Jenkins',
            numberOfPages: 150,
            author: 'Otor Emmanuel',
            reading: true,
        },
        {
            name: 'book',
            title: 'Python',
            description: 'Mastering python programming language',
            numberOfPages: 50,
            author: 'Otor Emmanuel',
            reading: true,
        },
        {
            name: 'book',
            title: 'JavaScript',
            description: 'Mastering JavaScript programming language',
            numberOfPages: 200,
            author: 'Otor Emmanuel',
            reading: true,
        },
        {
            name: 'book',
            title: 'things fall apart',
            description: 'Literary studies',
            numberOfPages: 100,
            author: 'Otor Emmanuel',
            reading: true,
        },
        {
            name: 'book',
            title: 'half of a yellow sunrise',
            description: 'Literary studies',
            numberOfPages: 300,
            author: 'Otor Emmanuel',
            reading: true,
        }
];

for (let number = 0; number < booksArray.length; number++) {
    if (booksArray[number].reading){
        console.log('Book Title: ' +( booksArray[number].title) + ', Author: ' + (  booksArray[number].author));
    }
  }