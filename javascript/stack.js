/*
Stack : LIFO
S.top(): 스택의 가장 윗 데이터를 반환한다. 만약 스택이 비었다면 이 연산은 정의불가 상태이다.
S.pop(): 스택의 가장 윗 데이터를 삭제한다. 스택이 비었다면 연산 정의불가 상태.
S.push(): 스택의 가장 윗 데이터로 top이 가리키는 자리 위에(top = top + 1) 메모리를 생성, 데이터 x를 넣는다.
S.empty(): 스택이 비었다면 1을 반환하고,그렇지 않다면 0을 반환한다.
*/

class Stack {
    constructor() {
        this.store = [];
    }

    push(item) {
        this.store.push(item);
    }

    pop() {
        return this.store.pop();
    }
}

const stack = new Stack();
stack.push(1);
stack.push(2);
stack.pop(); // 2


// js 배열을 스택처럼 다루기
var arr = [1, 2, 3];

// 배열의 첫번째 원소 제거. (첫번째 원소 값을 리턴)
var head = arr.shift();          

// 배열의 맨 앞에 1 추가.
arr.unshift(1);

// 배열의 맨 뒤에 2 추가.
arr.push(2);

// 배열의 마지막 원소 제거. (마지막 원소 값을 리턴)
var tail = arr.pop();