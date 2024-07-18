//const myFavLanguage = "JavaScript"

//const date = 6
//const name = 'friday 5th june 2024'
//const sentence = 'Todays date is ' + name +'. '+'We are in the 20th weeks of the year, the month is '+date+'th of the year'


//const isBritish = true
//const isNight = false

//const userDetails = null

//const addition = 40+2 

//const compare = 4 > 3   

//const userName = 'Success'
//const age = 20

//const logic = age ===12 || userName === 'victory'  

//const age = 50

//if(age>=32 ) {
    //console.log('You are eligible to vote')
//} else {
    //console.log('You are too young to vote')
//}
  
//for(let number = 1;number <=20; number = number+1) {
    //if(number % 2 === 0) {
        //console.log(number +' is an even number') 
    //} else {
        //console.log(number +' is an odd number')
    //}

    const myObject = {
        name: 'book',
        Author: 'things fall apart',
        pages: 500
    }

    
    const book = {
        isopen:false,
        Author:'things fall apart',
        pages: 500,
        toggleOpenAndClose: function(){
            if(book.isOpen===true) {
                book.isOpen =false
            } else {
                book.isOpen = true
            }
        }
    }
    book.toggleOpenAndClose()
    console.log(book.isOpen)

    

