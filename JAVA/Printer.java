package com.programmers.algorithm;

import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> works = new LinkedList<>();
        for (int prioty : priorities){
            works.add(prioty);
        }

        int max = Collections.max(works);;
        int afterLocation = location;
        int checkNum;
        int loopCnt = 0;
        while(true) {
            System.out.println();
            System.out.println("loop cnt : " + ++loopCnt );

            checkNum = works.peek();
            System.out.println("before : " + location);
            System.out.println("max : " + max);

            if(checkNum != max){
                works.add(works.poll());
                afterLocation = relocateIdx(works, afterLocation);
                System.out.println("에드팝");
            }else {
                works.poll();
                max = Collections.max(works);

                if(afterLocation == 0 && max == priorities[location]){
                    break;
                }
                answer++;
                afterLocation = relocateIdx(works, afterLocation);

                System.out.println("팝");
            }
            System.out.println(works);
            System.out.println("answer : " + answer);
            System.out.println("after : " + afterLocation);
            System.out.println("check : " + checkNum);
            max = Collections.max(works);
            if(max == priorities[location] && afterLocation == 0) break;
        }
        return answer+1;
    }
    public int relocateIdx(Queue<Integer> queue, int num){
        int idx = num;
        if(idx == 0){
            if (queue.size() == 0){
                idx = 0;
            }else {
                idx = queue.size() - 1;
            }

        }else {
            idx = idx - 1;
        }
        return idx;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
//        int[] priorities = {3, 3, 4, 2};
//        int location = 3;
//        int[] priorities = {1, 1, 9, 1, 1, 1};
//        int location = 0;
        int[] priorities = {2, 1, 2, 1, 3, 4};
        int location = 3;
//        int[] priorities = {5,4,3,2,1};
//        int location = 3;
//        int[] priorities = {9, 9, 9, 9, 9};
//        int location = 1;
//        int[] priorities = {1, 1, 3, 2, 1, 4, 1, 1, 3, 1, 1, 1};
//        int location = 8;
//        int[] priorities = {1, 2, 3, 4};
//        int location = 2;
        System.out.println(printer.solution(priorities, location));
    }
}
