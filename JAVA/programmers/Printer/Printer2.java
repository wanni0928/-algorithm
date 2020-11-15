package com.programmers.algorithm;

import java.util.*;

public class Printer2 {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue<Integer> works = new PriorityQueue<>(Collections.reverseOrder());
        for (int prioty : priorities){
            works.add(prioty);
        }
        System.out.println(works);
        System.out.println(Arrays.toString(priorities));
        while(!works.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == (int) works.peek()){
                    if(i == location){
                        return answer;
                    }
                    works.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Printer2 printer = new Printer2();
//        int[] priorities = {2, 1, 3, 2};
//        int location = 2;
//        int[] priorities = {3, 3, 4, 2};
//        int location = 3;
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
//        int[] priorities = {2, 1, 2, 1, 3, 4};
//        int location = 3;
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
