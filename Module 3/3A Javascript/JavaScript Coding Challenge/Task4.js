// // Print a table containing multiplication tables

for (let firstNumber = 1; firstNumber <= 100; firstNumber++){
    for (let secondNumber = 1; secondNumber <= 12; secondNumber++){
        const multiply = firstNumber * secondNumber;
        
        console.log(firstNumber + " * " + secondNumber + " = " + (multiply));
    
     }
 }


//const size = 10;
//for (let i = 1; i <= size; i++) {
    //let row = '';
    //for (let j = 1; j <= size; j++) {
    //    row += (i * j).toString().padStart(4, ' ');
    //}
    //console.log(row);
//}
