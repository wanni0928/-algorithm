function solution(answers) {
    const student1 = [1,2,3,4,5];
    const student2 = [2,1,2,3,2,4,2,5];
    const student3 = [3,3,1,1,2,2,4,4,5,5];
    
    let answer = [];
    let studentList = [student1, student2, student3];
    let temp = [];
    let max = 0;
    
    studentList.forEach((item, idx, arr) => {
        // temp.push((item.filter(function(item, idx, arr){
        //     console.log(idx);
        //     return arr[idx] === answers[idx];
        // })).length);
        temp.push(
            (t).length
        );
    });    
    max = temp.reduce((previous, current) => { return previous > current ? previous : current });

    for(let i = 0; i < temp.length; i++){
        if(temp[i] === max){
            answer.push(i + 1);
        }
    }
    answer.sort();
    return answer;
}