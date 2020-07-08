function solution(answers) {
    const student1 = [1,2,3,4,5];
    const student2 = [2,1,2,3,2,4,2,5];
    const student3 = [3,3,1,1,2,2,4,4,5,5];
    let answer1 = 0;
    let answer2 = 0;
    let answer3 = 0;
    
    let answer = [];
    let max = 0;
    
    let samples = [];
    answers.forEach((item, idx, arr) => {
        if(arr[idx] === student1[idx % student1.length]){
            answer1++;
        }
        if(arr[idx] === student2[idx % student2.length]){
            answer2++;
        }
        if(arr[idx] === student3[idx % student3.length]){
            answer3++;
        }
    });
    samples = [answer1, answer2, answer3];
    max = samples.reduce((previous, current) => {return previous > current ? previous : current});
    console.log(max);
    for(let i = 0; i < samples.length; i++){
        if(samples[i] === max){
            answer.push(i+1);
        }
    }
    return answer;
}