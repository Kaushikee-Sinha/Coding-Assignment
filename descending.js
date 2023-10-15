const input = prompt("Enter numbers separated by spaces:");
const inputArray = input.split(" ").map(Number);


inputArray.sort((a, b) => b - a);


console.log("Sorted array in descending order: " + inputArray);
