package study.algorith.datastructure;

import java.util.Stack;

/**
 * 스택(Stack)
 *
 * - 데이터를 제한적으로 접근할 수 있는 구조.
 *      - 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조
 *      - 가장 나중에 쌓은 데이터를 가장 먼저 빼낼 수 있는 데이터 구조
 *          | 큐 : FIFO 정책
 *          | 스택 : LIFO 정책
 *
 *      - 주요 기능
 *          | push() : 데이터를 스택에 넣기
 *          | pop() : 데이터를 스택에서 꺼내기
 */
public class StackData implements Comparable<StackData> {
    int idx;
    int data;

    public StackData() {
    }

    public StackData(int idx, int data) {
        this.idx = idx;
        this.data = data;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "StackData{" +
                "idx=" + idx +
                ", data=" + data +
                '}';
    }

    @Override
    public int compareTo(StackData o) {
        return this.idx - o.idx;
    }
}

class StackTest{
    public static void main(String[] args) {
        Stack<StackData> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(new StackData(i, (int) (Math.random() * 100)));
        }
        System.out.println(stack);
        System.out.println(stack.search(71)); // 없을 경우 -1 반환
        
        // 찾는 값이 있을경우, 그 값을 출력하는 것이 아니라,
        // 꼭대기로부터 몇칸 '차이'를 출력한다.
        System.out.println(stack.search(1));
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // 삭제할 데이터가 없을 경우 오류 EmptyStackException 발생


    }
}
