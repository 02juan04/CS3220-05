function max1(array){
    var max = 0;
    for(var i = 0; i < array.length; i++){
        if(array[i] > max){
            max = array[i];
        }
    }
    return max;
}
console.log(`greatest number using for loop: ${max1([3,5,4,6,5])}`);

function max2(array){
    var max = 0;
    array.forEach(element => {
        if(element > max){
            max = element;
        }
    });
    return max;
}
console.log(`The greatest number using forEach is ${max2([3,5,4,6,5])}`);

function max3(arr) {
    return arr.reduce((max, current) => {
        return Math.max(max, current);
    }, arr[0]);
}

console.log(`Greatest number using reduce: ${max3([3,5,4,6,5])}`);

function countingWords(arr) {
    let wordCount = {};
    arr.forEach(word => {
        word = word.toLowerCase();
        if (wordCount[word]) {
            wordCount[word] += 1;
        } else {
            wordCount[word] = 1;
        }
    });
    return wordCount;
}
console.log(countingWords(['hi', 'hi', 'hello', 'world', 'hello', 'hi', 'greetings', 'World']));

function getTotalSumArray(arr) {
    let totalSum = 0;

    for (let i = 0; i < arr.length; i++) {
        if (typeof arr[i] === 'number') {
            totalSum += arr[i];
        } else {
            continue;
        }
    }
    return totalSum;
}

console.log(getTotalSumArray([5, 2, 'a', 4, '7', true, 'b', 'c', 7, '8', false]));