function solution(arr, divisor) {
    var answer = [];
    answer = arr.filter(number => number % divisor === 0)
    return answer.length !== 0 ? answer.sort(function(a, b){return a - b;}) : [-1];
}